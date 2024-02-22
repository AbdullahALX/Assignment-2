import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Problem1 {
    // setting the number of guests
    private static final int NUM_GUESTS = 50;

    public static void main(String[] args) {
        // to track all threads
        ArrayList<Guest> guestsList = new ArrayList<>(NUM_GUESTS);
        // to track if guest ate or not
        ArrayList<Boolean> eatenList = new ArrayList<>(NUM_GUESTS);
        // to track all eaten cupcakes
        int eatenCups = 0;

        long startTime = System.currentTimeMillis();

        // Initializing all guests threads.
        for (int i = 1; i <= NUM_GUESTS; i++) {
            eatenList.add(false);
            Guest guest = new Guest();
            guestsList.add(guest);
            guest.start();
        }

        // looping over guestsList to check eaten cupcakes
        while (eatenCups < NUM_GUESTS) {
            int randIdx = ThreadLocalRandom.current().nextInt(NUM_GUESTS) + 1;
            //getting random guest
            Guest currGuest = guestsList.get(randIdx - 1);
            // flag that current guest in maze
            currGuest.setInMaze(true);

            // this check if current guest has ate the cupcake and check if cupcake available
            if (currGuest.hasAteCupcake() && !eatenList.get(randIdx - 1)) {
                eatenCups++;
                eatenList.set(randIdx - 1, true);
                System.out.println("Guest " + randIdx + " eats the cupcake");
            }
        }

        System.out.println("All guests have entered the labyrinth and eaten a cupcake. Total cupcakes eaten: " + eatenCups);

        // Recording the end time
        long endTime = System.currentTimeMillis();

        // Calculating and printing the total time taken
        long totalTime = endTime - startTime;


        System.out.println("Total time taken for all guests to enter: " + totalTime + "ms");
    }
}

class Guest extends Thread {
    private boolean ateCupcake;
    private boolean inMaze;

    Guest() {
        ateCupcake = false;
        inMaze = false;
    }

    @Override
    public void run() {
        if (!ateCupcake) {
            eatCupcake();
        }
    }

    private synchronized void eatCupcake() {
        if (!ateCupcake) {
            ateCupcake = true;
        }
    }

    synchronized boolean hasAteCupcake() {
        return ateCupcake;
    }

    synchronized void setInMaze(boolean inMaze) {
        this.inMaze = inMaze;
    }
}
