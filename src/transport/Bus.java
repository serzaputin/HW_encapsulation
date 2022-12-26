package transport;

public class Bus extends Transport {

    private String fuelPercentage;

    public Bus(String brand, String model, int year, String country, String color, double maxSpeed, String fuelPercentage) {
        super(brand, model, year, country, color, maxSpeed);
        if (fuelPercentage.isBlank() || fuelPercentage.isEmpty()) {
            this.fuelPercentage = "100,00";
        } else {
            this.fuelPercentage = fuelPercentage;
        }
    }

    public String getFuelPercentage() {
        return fuelPercentage;
    }

    @Override
    public void refill(String fuelPercentage) {
    }
}