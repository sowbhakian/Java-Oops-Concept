package t.threadsClass;
public class BDaemonDemo {
    /**
     * Main method demonstrating daemon threads.
     * Shows the difference between user threads and daemon threads.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Thread userThread = new Thread(() -> {
        	for(int i=0;i<5;i++) {
	            System.out.println("User thread running...");
	            try { Thread.sleep(1000); } catch (InterruptedException e) {}
	            System.out.println("User thread finished.");
        	}
        });

        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread running...");
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });
        daemonThread.setDaemon(true);//If it is not set as TRUEm daemon thread will run infinitely

        userThread.start();
        daemonThread.start();
        
                
      //anonymous inner class
        Thread daemonThread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Daemon thread running...");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // Handle interruption if needed
                    }
                }
            }
        });
       
        
    }
}



