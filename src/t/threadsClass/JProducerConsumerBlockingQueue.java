package t.threadsClass;

import java.util.concurrent.*;

public final class JProducerConsumerBlockingQueue {

	/**
	 * Main method demonstrating producer-consumer pattern using BlockingQueue.
	 * Shows how BlockingQueue simplifies thread synchronization.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
		Boolean isConsumed = true;
		new Thread(new QueueProducer(queue,isConsumed)).start();
		new QueueConsumer(queue,isConsumed).start();

		// basicObjectLearning();

	}

	/**
	 * Demonstrates basic BlockingQueue operations and generic wildcards.
	 */
	private static void basicObjectLearning() {
		// Object referencing
		BlockingQueue<Integer> q1 = new ArrayBlockingQueue<Integer>(10);
		q1.add(1);
		q1.add(2);
		BlockingQueue<Integer> q2 = q1;
		q2.add(5);

		System.out.println("Q1 : " + q1 + "Q2 : " + q2);

		// read Only with any Object
		BlockingQueue<?> q3 = q1;
		// q3.add(5); //Compilation error
		System.out.println("Peek : " + q3.peek());

		// write Only with specific Object - supertypes(Parent class) can also be part
		// of this object
		BlockingQueue<? extends Integer> q4 = q1;
		// q4.add(10); //Compilation error
		System.out.println("Peek : " + q3.peek());

		// Read & Write access object - supertypes(Parent class) can also be part of
		// this object
		BlockingQueue<? super Integer> q5 = q1;
		q5.add(3);
		q5.peek();

		// Read & Write access Object - Only with the specifed Type
		BlockingQueue<Integer> q6 = q1;
	}

}

class QueueProducer implements Runnable {
	ArrayBlockingQueue<Integer> queue;
	Boolean isConsumed ;
	/**
	 * Constructor for QueueProducer.
	 * @param queue the queue to produce items into
	 * @param isConsumed flag indicating if items are consumed
	 */
	public QueueProducer(ArrayBlockingQueue<Integer> queue,Boolean isConsumed ) {
		this.queue = queue;
		this.isConsumed = isConsumed;
	}

	/**
	 * Produces items into the blocking queue.
	 */
	public synchronized void run() {
		for (int i = 1; i <= 5; i++) {
			// System.out.println("inside QueueProducer" +i);
			try {
				while(!isConsumed) {
					wait();
				}
				queue.add(i);
				System.out.println(" i = " + i + " QueueProducer = " + queue + " isConsumed " + isConsumed);
				notify();
				isConsumed = false;
//				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class QueueConsumer extends Thread {

	BlockingQueue<Integer> queue;
	Boolean isConsumed ;
	
	/**
	 * Constructor for QueueConsumer.
	 * @param queue the queue to consume items from
	 * @param isConsumed flag indicating if items are consumed
	 */
	public QueueConsumer(ArrayBlockingQueue<Integer> queue,Boolean isConsumed ) {
		this.queue = queue;
		this.isConsumed = isConsumed;
	}

	/**
	 * Consumes items from the blocking queue.
	 */
	public synchronized void run() {
		for (int i = 1; i <= 5; i++) {
			 System.out.println("inside QueueConsumer" +i + " isConsumed " + isConsumed);
			try {
				while(isConsumed) {
					wait();
				}
				System.out.println(" i = " + i + " QueueConsumer = " + queue.take() + "\n");
				notify();
				isConsumed = false;
//				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
