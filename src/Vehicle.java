public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected double rentalPricePerDay;

    public Vehicle(String brand, String model, double rentalPricePerDay) {
        if (rentalPricePerDay < 0) {
            throw new IllegalArgumentException("Rental price cannot be negative");
        }
        this.brand = brand;
        this.model = model;
        this.rentalPricePerDay = rentalPricePerDay;
    }

    public abstract double calculateRentalCost(int days);

    public void display() {
        System.out.println("The " + brand + " " + model + " rental price per day is $" + rentalPricePerDay);
    }

}
