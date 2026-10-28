package lab6;

public class Ride {

    private String passengerName;
    private String pickup;
    private String destination;
    private double distanceKm;
    private int durationMin;
    private double pricePerKm;

    public Ride(String passengerName, String pickup, String destination,
                double distanceKm, int durationMin, double pricePerKm) {

        this.passengerName = passengerName;
        this.pickup = pickup;
        this.destination = destination;

        if (distanceKm <= 0) {
            System.out.println("Warning: Invalid distance.");
            distanceKm = 1;
        }
        this.distanceKm = distanceKm;

        if (durationMin <= 0) {
            System.out.println("Warning: Invalid duration.");
            durationMin = 1;
        }
        this.durationMin = durationMin;

        if (pricePerKm <= 0) {
            System.out.println("Warning: Invalid price per km.");
            pricePerKm = 1;
        }
        this.pricePerKm = pricePerKm;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getPickup() {
        return pickup;
    }

    public String getDestination() {
        return destination;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public double getPricePerKm() {
        return pricePerKm;
    }

    public double calculateFare() {
        return distanceKm * pricePerKm;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "passengerName=" + passengerName +
                ", pickup=" + pickup +
                ", destination=" + destination +
                ", distanceKm=" + distanceKm +
                ", durationMin=" + durationMin +
                ", pricePerKm=" + pricePerKm +
                ", fare=" + calculateFare() +
                '}';
    }
}