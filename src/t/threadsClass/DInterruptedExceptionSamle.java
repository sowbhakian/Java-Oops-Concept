package t.threadsClass;

public class DInterruptedExceptionSamle {

	/**
	 * Main method demonstrating thread interruption.
	 * Shows how to interrupt a sleeping thread.
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		Worker t = new Worker();
		t.start();
		t.interrupt();

	}
}

class Worker extends Thread {
    /**
     * The run method that can be interrupted.
     * Demonstrates handling InterruptedException.
     */
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
