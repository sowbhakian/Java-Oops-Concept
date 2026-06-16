package t.threadsClass;

import java.util.*;
import java.util.concurrent.*;

public class AThreadCreation {

	/**
	 * Main method demonstrating different ways to create threads.
	 * Shows both Thread extension and Runnable implementation.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Multi-Threading");

		//Thread Class
		MyThread t1 = new MyThread();
//		t1.start(); // starts the thread

		//Runnable Interface
		Thread t2 = new Thread(new MyRunnable());
//		t2.start();
		
		//Anonymous Thread class - both Thread and Runnable can be used
		Thread t3 = new Thread() {
			public void run() {
				System.out.println("Anonymous Thread Class");
			}
		};
		
		Runnable t4 = new Runnable() {
			public void run() {
				System.out.println("Anonymous Thread Class");
			}
		};
		
		//Lambda Thread - Only Thread can be used for the lambda use case
		Thread t5 = new Thread(()->{
			System.out.println("Lamda Thread");
		});
		
		createThreadViaThreadPool();
	}

	private static void createThreadViaThreadPool() {
	
		try {
			ExecutorService exeService = Executors.newFixedThreadPool(10);
			for(int i=0;i<10;i++) {
				//submit() is async, we need to shutdown mannualy
				exeService.submit(()->{ //Runnable Interface to be created
					System.out.println("Thread Name : " + Thread.currentThread());
				});
			}
			
			//shutdown()Graceful – let tasks finish
			//shutdownNow()Forceful – interrupts tasks immediately
			
			exeService.shutdown();
			//Requires shutdown before using the awaitTermination, if the shutdown is not used then the JVM will be alive
			//this is kind of Thread.join() but waits for all thread to complete
			exeService.awaitTermination(10, TimeUnit.SECONDS);

		} catch (Exception e) {

		}
	}

}

// Example:1:run
//Thread  implements Runnable 
class MyThread extends Thread {
	/**
	 * The run method executed when the thread starts.
	 * Demonstrates extending Thread class.
	 */
	public void run() {
		System.out.println("Thread Class");
	}
}

// Example:2:
class MyRunnable implements Runnable {
	/**
	 * The run method executed when the thread starts.
	 * Demonstrates implementing Runnable interface.
	 */
	public void run() {
		System.out.println("Runnable Interface");
	}
}
