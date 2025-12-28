
public class Main {
    public static void main(String[] args) {

        RentalAgency agency = new RentalAgency();

        // Create different vehicle types
        Car car1 = new Car("Toyota", "Camry", 50.0, 5);
        Car car2 = new Car("Honda", "Accord", 39.99, 5);
        Motorcycle moto1 = new Motorcycle("Harley", "Sportster", 40.0, 883);
        Truck truck1 = new Truck("Ford", "F-150", 80.0, 2.5);

        agency.addVehicle(car1);
        agency.addVehicle(car2);
        agency.addVehicle(moto1);
        agency.addVehicle(truck1);

        // Display all
        agency.displayAllVehicles();

        // Calculate revenue
        int rentalDays = 7;
        System.out.println("Total revenue for " + rentalDays + " days: $"
                + agency.getTotalRevenue(rentalDays));


    }
}