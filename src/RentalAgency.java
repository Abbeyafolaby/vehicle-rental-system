import java.util.ArrayList;

public class RentalAgency {

    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void displayAllVehicles() {
        System.out.println("=== All Vehicles ===");
        for (Vehicle v : vehicles) {
            v.display();  // Polymorphism! Calls correct version
            System.out.println();
        }
    }

    public double getTotalRevenue(int days) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateRentalCost(days);  // Polymorphism again!
        }
        return total;
    }

}
