package t.threadsClass;

public class ESynchronize {
    /**
     * Main method demonstrating thread synchronization.
     * Shows how synchronized blocks prevent race conditions.
     * @param args command line arguments
     */
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

    /**
     * Books tickets for a customer.
     * Uses synchronized block to ensure thread-safe ticket booking.
     * @param name the customer's name
     * @param ticketsRequested the number of tickets requested
     */
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