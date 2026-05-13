package assets;

public abstract class Asset {
    private String description;

    public Asset(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    abstract public double getValue();

}
