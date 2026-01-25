package t.threadsClass;

public class ThreadBasic {
    public static void main(String[] args) {
        MessageBox box = new MessageBox();

        Thread producer = new Thread(new Producer(box));
        Thread consumer = new Thread(new Consumer(box));

        producer.start();
        consumer.start();
    }
}


class Consumer implements Runnable {
    private MessageBox box;

    Consumer(MessageBox box) {
        this.box = box;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            box.take();
            try { Thread.sleep(1000); } catch (Exception e){}
        }
    }
}


class Producer implements Runnable {
    private MessageBox box;

    Producer(MessageBox box) {
        this.box = box;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            box.put("Msg " + i);
            try { Thread.sleep(500); } catch (Exception e){}
        }
    }
}


class MessageBox {
    private String message;
    private boolean hasMessage = false;

    public synchronized void put(String msg) {
        while (hasMessage) {   // wait until consumer reads the message
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        message = msg;
        hasMessage = true;
        System.out.println("Produced: " + msg);

        notify();  // wake waiting consumer
    }

    public synchronized String take() {
        while (!hasMessage) {   // wait until message is available
            try {
                wait();
            } catch (InterruptedException e) {}
        }

        hasMessage = false;
        System.out.println("Consumed: " + message);

        notify(); // wake producer
        return message;
    }
}
