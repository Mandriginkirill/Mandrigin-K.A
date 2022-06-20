public class UsedCar extends Car {
    private String degreeOfPreservation;
    private String FIOowner;
    private int mileage;

    public UsedCar(String modelCar, int release, int price, String equipment, String country, String dataOfSale, String FIObuyer, String degreeOfPreservation, String FIOowner, int mileage) {
        super(modelCar, release, price, equipment, country, dataOfSale,FIObuyer);
        this.degreeOfPreservation = degreeOfPreservation;
        this.FIOowner = FIOowner;
        this.mileage = mileage;
    }

    public void setDegreeOfPreservation(String degreeOfPreservation) {
        this.degreeOfPreservation = degreeOfPreservation;
    }
    public String getDegreeOfPreservation() {
        return degreeOfPreservation;
    }

    public void setFIOowner(String FIOowner) {
        this.FIOowner = FIOowner;
    }
    public String getFIOowner() {
        return FIOowner;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
    public int getMileage() {
        return mileage;
    }

    public String toString()
    {
        return super.toString() + "\nCтепень сохранности - " + degreeOfPreservation + "\nФИО владельца - " + FIOowner + "\nПробег - " + mileage;
    }
}