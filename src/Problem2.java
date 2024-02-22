
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;


// implementing third strategy, only one guest could be in the room
public class Problem2 {
    // Setting the number of guests
    private static final int NUM_GUESTS = 10;

    public static void main(String[] args) {


        // Creating the showroom with a semaphore to control access
        Showroom showroom = new Showroom();

        // Initializing all guest threads.
        for (int i = 1; i <= NUM_GUESTS; i++) {
            Guest2 guest = new Guest2("Guest " + i, showroom);
            guest.start();
        }


    }
}

class Showroom {
    private Semaphore semaphore;

    public Showroom() {
        semaphore = new Semaphore(1); // Only one guest can enter at a time
    }

    public void enterShowroom(String guestName) {
        try {
            semaphore.acquire();
            System.out.println(guestName + " enters the showroom.");
            // Simulating the guest spending some time in the showroom
            Thread.sleep(ThreadLocalRandom.current().nextInt(3000)); // Guest spends some time in the showroom
            System.out.println(guestName + " leaves the showroom.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

class Guest2 extends Thread {
    private String guestName;
    private Showroom showroom;

    Guest2(String name, Showroom showroom) {
        this.guestName = name;
        this.showroom = showroom;
    }

    @Override
    public void run() {
        // Simulating the guest waiting for some time (roaming around the castle and enjoying the party)
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(3000)); // Guest waits for some time before attempting to enter the showroom
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Attempting to enter the showroom
        showroom.enterShowroom(guestName);
    }
}
