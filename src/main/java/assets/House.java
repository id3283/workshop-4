package assets;

public class House extends Realestate{
    private int squareFootage;

    public House(int squareFootage) {
        super("house", squareFootage);
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    @Override
    public double getValue() {
        return this.squareFootage * 150;
    }

}
