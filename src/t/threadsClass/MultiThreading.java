package t.threadsClass;

import java.util.*;
import java.util.concurrent.*;

public class MultiThreading {

	/**
	 * Main method demonstrating different ways to create threads.
	 * Shows both Thread extension and Runnable implementation.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("Multi-Threading");

		MyThread example1 = new MyThread();
		example1.start(); // starts the thread

		Thread example2 = new Thread(new MyRunnable());
		example2.start();
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
		System.out.println("Thread is running");
	}
}

// Example:2:
class MyRunnable implements Runnable {
	/**
	 * The run method executed when the thread starts.
	 * Demonstrates implementing Runnable interface.
	 */
	public void run() {
		System.out.println("Runnable thread is running");
	}
}
