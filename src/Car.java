public class Car extends Vehicle{

    private final int numOfSeats;

    public Car(String brand, String model, double rentalPricePerDay, int numOfSeats) {
        super(brand, model, rentalPricePerDay);
        this.numOfSeats = numOfSeats;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalPricePerDay * days;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("It has a total seat of " + numOfSeats);
    }

}
