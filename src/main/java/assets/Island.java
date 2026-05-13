package assets;

public class Island extends Realestate {
    private int squareMileage;

    public Island(String description, int squareFootage) {
        super(description, squareFootage);
    }



    @Override
    public double getValue() {
        return this.squareMileage * 10_000;
    }
}
