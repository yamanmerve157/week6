package lab6;

public class SharedRide extends EconomyRide {

    private int passengerCount;

    public SharedRide(String passengerName, String pickup,
                      String destination, double distanceKm,
                      int durationMin, double pricePerKm,
                      double pricePerMinute, int passengerCount) {

        super(passengerName, pickup, destination,
              distanceKm, durationMin, pricePerKm,
              pricePerMinute);

        if (passengerCount < 1 || passengerCount > 4) {
            System.out.println("Warning: Invalid passenger count.");
            passengerCount = 1;
        }

        this.passengerCount = passengerCount;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    @Override
    public double calculateFare() {
        double farePerPassenger =
                super.calculateFare() / passengerCount;

        return farePerPassenger * 1.10;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", passengerCount=" + passengerCount;
    }
}