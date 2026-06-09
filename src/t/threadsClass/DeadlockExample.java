package t.threadsClass;
class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    /**
     * First method that acquires lockA then lockB.
     * Can cause deadlock when called concurrently with method2.
     */
    public void method1() {
        synchronized (lockA) {
            System.out.println("Thread 1: Holding lock A...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockB) {
                System.out.println("Thread 1: Acquired lock B!");
            }
        }
    }

    /**
     * Second method that acquires lockB then lockA.
     * Can cause deadlock when called concurrently with method1.
     */
    public void method2() {
        synchronized (lockB) {
            System.out.println("Thread 2: Holding lock B...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockA) {
                System.out.println("Thread 2: Acquired lock A!");
            }
        }
    }
}