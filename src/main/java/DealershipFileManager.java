public class DealershipFileManager {

    public static Dealership getDealership() {

        // read the first line of the file
        Dealership dealership = new Dealership("Dave's Vintage Lemons", "50 St Kath", "+4498798796");

        // for each addional line in the file
        // read a vehicle line like `10112|1993|Ford|Explorer|SUV|Red|525123|995.00`
        // use it to make a Vehicle object
        // then add it to your Dealership inventory like this:
        Vehicle vehicle = new Vehicle();
        dealership.addVehicle(vehicle);

        return dealership;
    }
}
