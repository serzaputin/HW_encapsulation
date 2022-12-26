package transport;

public class Train extends Transport {
    private final double tripPrice;
    private int tripTime;
    private final String departureStationName;
    private final String finalStop;
    private final int numberOfCar;
    private String fuelPercentage;

    public Train(double tripPrice, int tripTime, String departureStationName, String finalStop, int numberOfCar, String brand, String model, int year, String country, String color, double maxSpeed, String fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed);
        if (tripPrice <= 0) {
            this.tripPrice = 100;
        } else {
            this.tripPrice = tripPrice;
        }
        if (tripTime <= 0) {
            this.tripTime = 100;
        } else {
            this.tripTime = tripTime;
        }
        if (departureStationName == null || departureStationName.equals("")) {
            this.departureStationName = "default";
        } else {
            this.departureStationName = departureStationName;
        }
        if (finalStop == null || finalStop.equals("")) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }
        if (numberOfCar <= 0) {
            this.numberOfCar = 100;
        } else {
            this.numberOfCar = numberOfCar;
        }
        this.fuelPercentage = fuelPercentage;
    }

    public String getFuelPercentage() {
        return fuelPercentage;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    @Override
    protected void refill(String fuelPercentage) {
    }


}