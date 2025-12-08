package counters;

import java.util.concurrent.Semaphore;

class ParkingLot {
    private final Semaphore spots;

    public ParkingLot(int totalSpots) {
        spots = new Semaphore(totalSpots); // number of parking spaces
    }

    public void parkCar(String car) {
        try {
            System.out.println(car + " trying to park.");
            spots.acquire(); // acquire a spot
            System.out.println(car + " parked.");
            Thread.sleep(1000); // car is parked for a while
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            spots.release(); // free the spot
            System.out.println(car + " left.");
        }
    }
}

public class SemaphoreDemo {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot(3); // 3 parking spaces

        for (int i = 1; i <= 6; i++) { // 6 cars
            final String carName = "Car" + i;
            new Thread(() -> lot.parkCar(carName)).start();
        }
    }
}

