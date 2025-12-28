public class Car extends Vehicle{

    private final int numberOfSeats;

    public Car(String brand, String model, double rentalPricePerDay, int numOfSeats) {
        super(brand, model, rentalPricePerDay);
        this.numberOfSeats = numOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Seat: " + numberOfSeats);
    }

}
