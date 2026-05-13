public class UserInterface {
    private Dealership dealership;

    public UserInterface() {

    }

    private void init() {
        this.dealership = DealershipFileManager.getDealership();
    }

    public void display() {
        init();
        // display the top-level menu
    }


}
