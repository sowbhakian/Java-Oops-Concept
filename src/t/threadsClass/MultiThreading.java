package t.threadsClass;

import java.util.*;
import java.util.concurrent.*;

public class MultiThreading {

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
	public void run() {
		System.out.println("Thread is running");
	}
}

// Example:2:
class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Runnable thread is running");
	}
}
