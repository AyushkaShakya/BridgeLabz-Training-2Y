package Sampleproblems;

class Vehicle {
    private static double registrationFee = 5000.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration No: " + this.registrationNumber);
            System.out.println("Owner: " + this.ownerName);
            System.out.println("Type: " + this.vehicleType);
            System.out.println("Fee: " + registrationFee);
            System.out.println("----------------------------");
        }
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("MH12AB1234", "Rajesh", "Car");
        Vehicle v2 = new Vehicle("DL08XY5678", "Sunita", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
    }
}
