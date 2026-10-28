package lab6;

import java.util.ArrayList;

public class Lab6 {

    public static void main(String[] args) {

        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new Ride(
                "Ali", "Home", "University",
                10, 20, 5));

        rides.add(new EconomyRide(
                "Ayse", "Home", "Mall",
                8, 15, 4, 1.5));

        rides.add(new PremiumRide(
                "Mehmet", "Hotel", "Airport",
                20, 30, 6, 15, 1.5));

        rides.add(new SharedRide(
                "Zeynep", "Home", "Center",
                12, 25, 4, 1.2, 3));

        for (Ride ride : rides) {
            System.out.println(ride);
            System.out.println("Fare: "
                    + ride.calculateFare());
            System.out.println("----------------");
        }
    }
}