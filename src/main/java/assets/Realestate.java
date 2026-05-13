package assets;

public class Realestate extends Asset{
    int squareFootage;

    public Realestate(String description, int squareFootage) {
        super(description);

        this.squareFootage = squareFootage;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
