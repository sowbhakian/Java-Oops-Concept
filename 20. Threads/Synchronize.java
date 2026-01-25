package com.java.learning.threads;

public class Synchronize {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(() -> counter.bookTicket("Alice", 2));
        Thread t2 = new Thread(() -> counter.bookTicket("Bob", 3));
        Thread t3 = new Thread(() -> counter.bookTicket("Charlie", 2));

        t1.start();
        t2.start();
        t3.start();
    }
}



class TicketCounter {
    private int availableTickets = 5;
    private final Object lock = new Object();

    public void bookTicket(String name, int ticketsRequested) {
        System.out.println(name + " is trying to book...");

        synchronized (lock) {
            if (availableTickets >= ticketsRequested) {
                System.out.println(name + " booked " + ticketsRequested + " ticket(s).");
                availableTickets -= ticketsRequested;
            } else {
                System.out.println(name + " tried to book " + ticketsRequested + " ticket(s), but not enough available.");
            }
        }

        System.out.println(name + " booking attempt finished.\n");
    }
}