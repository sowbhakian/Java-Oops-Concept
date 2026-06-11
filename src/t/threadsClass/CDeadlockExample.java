package t.threadsClass;

import java.math.BigDecimal;

class CDeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();
    private final BigDecimal lockC = new BigDecimal("0");// This is not a good practice, always use object for locks
    
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
    
    
    public void method3() {
        synchronized (lockC) {
            System.out.println("Thread 2: Holding lock B...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockA) {
                System.out.println("Thread 2: Acquired lock A!");
            }
        }
    }
}