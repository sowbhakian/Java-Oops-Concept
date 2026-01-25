package com.java.learning.threads;
class DeadlockExample {
    private final Object lockA = new Object();
    private final Object lockB = new Object();

    public void method1() {
        synchronized (lockA) {
            System.out.println("Thread 1: Holding lock A...");
            try { Thread.sleep(100); } catch (InterruptedException ignored) {}
            synchronized (lockB) {
                System.out.println("Thread 1: Acquired lock B!");
            }
        }
    }

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