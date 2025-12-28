public class Truck extends Vehicle {

    private final double cargoCapacity;

    public Truck(String brand, String model, double rentalPricePerDay, double cargoCapacity) {
        super(brand, model, rentalPricePerDay);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days + (cargoCapacity * 10);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
    }
}
