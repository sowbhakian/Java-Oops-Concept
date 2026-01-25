package t.threadsClass;

public class InterruptedExceptionSamle {

	public static void main(String[] args) {
		Worker t = new Worker();
		t.start();
		t.interrupt();

	}
}

class Worker extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");
        }
    }
}
