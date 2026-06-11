package t.threadsClass;

public class IProducerConsumer {

	/**
	 * Main method demonstrating producer-consumer pattern.
	 * Shows custom implementation with wait/notify.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Queue q = new Queue();
		new Thread(new Produce(q)).start();
		new Consume(q).start();
	}

}

class Queue {

	int things = 1;
	Boolean isConsumed = true;

	/**
	 * Produces an item and notifies consumers.
	 * Uses wait/notify for synchronization.
	 */
	public void produce() {
//		System.out.println("isConsumed : produce " + isConsumed);
		try {
			while (!isConsumed) {
				wait();
			}
			System.out.println("Produce : " + things);
			isConsumed = false;
			notify();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	/**
	 * Consumes an item and notifies producers.
	 * Uses wait/notify for synchronization.
	 * @return the consumed item
	 */
	public  void consume() {
//		System.out.println("isConsumed : consume " + isConsumed);
		try {
			while (isConsumed) {
				wait();
			}
			System.out.println("Consume : " + things+++"\n");
			notify();
			isConsumed = true;
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

class Produce implements Runnable {
	Queue q;
	/**
	 * Constructor for Produce.
	 * @param q the queue to produce items into
	 */
	public Produce(Queue q) {
		this.q = q;
	}

	public void run() {
		try {
			for(int i=0;i<5;i++)
			q.produce();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}

class Consume extends Thread {
	Queue q;
	/**
	 * Constructor for Consume.
	 * @param q the queue to consume items from
	 */
	public Consume(Queue q) {
		this.q = q;
	}

	public void run() {
		try {
			for(int i=0;i<5;i++)
			q.consume();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
