import java.util.ArrayList;
import java.util.Collections;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        this.inventory = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getAllVehicles() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle v : this.inventory) {
            vehicles.add(v);
        }

        return vehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for(Vehicle currentVehicle : this.inventory) {
            String currentColor = currentVehicle.getColor();

            if(currentColor.equalsIgnoreCase(color)) {
                vehicles.add(currentVehicle);
            }
        }

        return vehicles;
    }
}
