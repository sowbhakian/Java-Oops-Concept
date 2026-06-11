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
		
		//Anonymous Thread class
		Thread t3 = new Thread() {
			public void run() {
				System.out.println("Anonymous Thread Class");
			}
		};
		
		//Lambda Thread
		Thread t4 = new Thread(()->{
			System.out.println("Lamda Thread");
		});
		
		createThreadViaThreadPool();
	}

	private static void createThreadViaThreadPool() {
	
		try {
			ExecutorService exeService = Executors.newFixedThreadPool(10);
			for(int i=0;i<10;i++) {
				exeService.submit(()->{ //Runnable Interface to be created
					System.out.println("Thread Name : " + Thread.currentThread());
				});
			}

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
