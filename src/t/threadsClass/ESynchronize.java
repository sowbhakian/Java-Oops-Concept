package t.threadsClass;

//https://www.youtube.com/watch?v=FpNRXz696ZY

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ESynchronize {
	/**
	 * Main method demonstrating thread synchronization. Shows how synchronized
	 * blocks prevent race conditions.
	 * 
	 * @param args
	 *            command line arguments
	 */
	
	private static final int THREAD_COUNT = 5;
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
		Counter counter = new Counter();
		
		for (int i = 0; i < THREAD_COUNT; i++) {
			executor.submit(new Runnable() {				
				//You are NOT directly creating an interface object
				//You are creating an object of an anonymous class that implements the interface
				public void run() {
					for(int j=0;j<5;j++) {
						counter.incrementCounter();
						System.out.println(" Thread Name" + Thread.currentThread());						
					}
				}
				
			});
			
		}
	
		executor.shutdown();
		executor.awaitTermination(10, TimeUnit.SECONDS);
		
		System.out.println("Counter Value : " + counter.getCurrentCount());
	}

}


class Counter{
	
	//If the method used the same shared resource, then we need to use the same lock, not the different locks
	private final Object Object = new Object();
	int count = 0;
	
	AtomicInteger counterB = new AtomicInteger(); // Atomic Interger is thread safty, or else sync to be used
	
	public int getCurrentCount() {
		return this.count;
	}
	
	//1. synchronized  Method
	public synchronized void incrementCounter() {
		this.count++;
	}
	
	
	//2. synchronized Block
	public void incrementCounter(String dummyParam) {
		
		//some logic of code
		
		//Locks the current object instance
		//Only one thread can access this block per object
		synchronized (this) {			
			this.count++;
		}
		
		//some logic of code
		
	}
	
	
	//3. synchronized Block --> this is best practice 
	public void incrementCounter(int dummyParam) {
		
		//some logic of code
		
		//Locks the current object instance
		//Only one thread can access this block per object
		synchronized (Object) {			
			this.count++;
		}
		
		//some logic of code
		
	}
	
	//4. you can use atomic variable which is thread safty
	
	ReentrantLock lock = new ReentrantLock();
	//5.
	public void incrementCounter(float dummyParam) {
		
		//some logic of code
		lock.lock();
		
		
		//some logic of code
		
	}
	
	
	
}