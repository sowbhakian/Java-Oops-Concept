package t.threadsClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MultiThreadPrintingNumbers {

	public static void main(String[] args) {

		//    Always check whether the nextAliveThread() is alive
		
		Printer printer = new Printer();
		Map<Integer, Boolean> threadStatus = new HashMap<Integer, Boolean>();
		threadStatus.put(1, true);
		threadStatus.put(2, true);
		threadStatus.put(3, true);
		printer.threadStatus.putAll(threadStatus);

		Thread threadOne = new Thread(new ThreadOne(printer, "ThreadOne"));
		threadOne.setPriority(Thread.MAX_PRIORITY);//Hints the Schedule, but doest guarantee
		threadOne.start();
		Thread threadTwo = new Thread(new ThreadTwo(printer, "ThreadOne"));
		threadTwo.setPriority(Thread.NORM_PRIORITY);
		threadTwo.start();
		Thread threadThree = new Thread(new ThreadThree(printer, "ThreadOne"));
		threadThree.setPriority(Thread.MIN_PRIORITY);
		threadThree.start();

		try {
			threadTwo.join(1000);
			threadThree.join(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class ThreadOne implements Runnable {

	Printer printer;
	String threadName;

	public ThreadOne(Printer printer, String threadName) {
		this.printer = printer;
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 1; i <= 1; i++) {
			printer.printThread(threadName, 1);
		}
		printer.markThreadDead(1);
	}
}

class ThreadTwo implements Runnable {

	Printer printer;
	String threadName;

	public ThreadTwo(Printer printer, String threadName) {
		this.printer = printer;
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 1; i <= 2; i++) {
			printer.printThread(threadName, 2);
		}
		printer.markThreadDead(2);
	}
}

class ThreadThree implements Runnable {

	Printer printer;
	String threadName;

	public ThreadThree(Printer printer, String threadName) {
		this.printer = printer;
		this.threadName = threadName;
	}

	public void run() {
		for (int i = 1; i <= 3; i++) {
			printer.printThread(this.threadName, 3);
		}
		printer.markThreadDead(3);
	}
}

class Printer {
	int execution = 1;
	HashMap<Integer, Boolean> threadStatus = new HashMap<Integer, Boolean>();

	public synchronized void printThread(String threadName, int currentExecution) {
		try {
			while (currentExecution != execution) {
				wait();
			}
			execution = getAlivethread(currentExecution);
			notifyAll();
			System.out.println("Thread Name" + currentExecution);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public synchronized void markThreadDead(int i) {
		threadStatus.put(i,false);
		execution = getAlivethread(i);
		notifyAll();
	}

	private synchronized int getAlivethread(int currentExecution) {

		for(int i=0;i<3;i++) {
			currentExecution = (currentExecution%3)+1;
			if(threadStatus.get(currentExecution)) {
				return currentExecution;
			}
		}
		return -1;
	}

}
