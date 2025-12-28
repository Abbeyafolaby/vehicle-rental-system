public class Truck extends Vehicle {

    double cargoCapacity;

    public Truck(String brand, String model, double rentalPricePerDay, double cargoCapacity) {
        super(brand, model, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days + (cargoCapacity * 10);
    }
}
