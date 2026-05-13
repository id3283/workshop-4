import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Dealership dealership = new Dealership("Dave's Lemons", "155 Minories", "+44 555 3453");

        Vehicle v = new Vehicle(2534, 1979, "280ZX", "Nissan", "Car", "Black", 40_000, 6000);
        dealership.addVehicle(v);

        v = new Vehicle(2444, 1979, "280ZX", "Nissan", "Car", "Red", 50_000, 6000);
        dealership.addVehicle(v);

        ArrayList<Vehicle> blackCars = dealership.getVehiclesByColor("Black");

        System.out.println();

//        UserInterface ui = new UserInterface();
//        ui.display();

    }
}
