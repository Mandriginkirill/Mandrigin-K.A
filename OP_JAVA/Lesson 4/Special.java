public class Special extends Car {
    private String type;
    private String mass;
    private String dimensions;

    public Special(String modelCar, int release, int price, String equipment, String country, String dataOfSale, String FIObuyer, String type, String mass, String dimensions) {
        super(modelCar, release, price, equipment, country, dataOfSale,FIObuyer);
        this.type = type;
        this.mass = mass;
        this.dimensions = dimensions;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }
    public String getMass() {
        return mass;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public String getDimensions() {
        return dimensions;
    }

    public String toString()
    {
        return super.toString() + "\nВид - " + type + "\nМасса - " + mass + "\nГабаритные размеры - " + dimensions;
    }

}