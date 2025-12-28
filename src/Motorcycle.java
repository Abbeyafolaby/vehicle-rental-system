public class Motorcycle extends Vehicle {

    int engineSize;

    public Motorcycle(String brand, String model, double rentalPricePerDay, int engineSize) {
        super(brand, model, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days * 0.8;
    }
}
