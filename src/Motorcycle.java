public class Motorcycle extends Vehicle {

    private final int engineSize;

    public Motorcycle(String brand, String model, double rentalPricePerDay, int engineSize) {
        super(brand, model, rentalPricePerDay);
        this.engineSize = engineSize;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days * 0.8;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Engine Size: " + engineSize + " cc");
    }
}
