public class Sport extends Car {
    private String sek;
    private String volume;
    private String power;

    public Sport(String modelCar, int release, int price, String equipment, String country, String dataOfSale, String FIObuyer, String sek, String volume, String power) {
        super(modelCar, release, price, equipment, country, dataOfSale,FIObuyer);
        this.sek = sek;
        this.volume = volume;
        this.power = power;
    }

    public void setSek(String sek) {
        this.sek = sek;
    }
    public String getSek() {
        return sek;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
    public String getVolume() {
        return volume;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public String getPower() {
        return power;
    }

    public String toString()
    {
        return super.toString() + "\nКол-во секунд до набора скорости - " + sek + "\nОбъем двигателя - " + volume + "\nМощность - " + power;
    }

}