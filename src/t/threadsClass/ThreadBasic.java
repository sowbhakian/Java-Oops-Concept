package t.threadsClass;

public class ThreadBasic {
    /**
     * Main method demonstrating basic thread communication using wait and notify.
     * Shows producer-consumer pattern with synchronized methods.
     * @param args command line arguments
     */
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

    /**
     * Constructor for Consumer.
     * @param box the message box to consume messages from
     */
    Consumer(MessageBox box) {
        this.box = box;
    }

    /**
     * Consumes messages from the message box.
     * Demonstrates thread communication using wait/notify.
     */
    public void run() {
        for (int i = 1; i <= 5; i++) {
            box.take();
            try { Thread.sleep(1000); } catch (Exception e){}
        }
    }
}


class Producer implements Runnable {
    private MessageBox box;

    /**
     * Constructor for Producer.
     * @param box the message box to put messages into
     */
    Producer(MessageBox box) {
        this.box = box;
    }

    /**
     * Produces messages and puts them in the message box.
     * Demonstrates thread communication using wait/notify.
     */
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

    /**
     * Puts a message into the box.
     * Uses wait/notify for synchronization between producer and consumer.
     * @param msg the message to put
     */
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

    /**
     * Takes a message from the box.
     * Uses wait/notify for synchronization between producer and consumer.
     * @return the message from the box
     */
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
