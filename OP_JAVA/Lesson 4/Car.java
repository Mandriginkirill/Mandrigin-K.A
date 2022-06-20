public class Car {
    private String modelCar;
    private int release;
    private int price;
    private String equipment;
    private String country;
    private String dataOfSale;
    private String FIObuyer;

    public Car(String modelCar, int release, int price, String equipment, String country, String dataOfSale, String FIObuyer ) {
        this.modelCar = modelCar;
        this.release = release;
        this.price = price;
        this.equipment = equipment;
        this.country = country;
        this.dataOfSale = dataOfSale;
        this.FIObuyer = FIObuyer;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }
    public String getModelCar() {
        return modelCar;
    }

    public void setRelease(int release) {
        this.release = release;
    }
    public int getRelease(){
        return release;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }
    public String getEquipment() {
        return equipment;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }

    public void setDataOfSale(String dataOfSale) {
        this.dataOfSale = dataOfSale;
    }
    public String getDataOfSale() {
        return dataOfSale;
    }

    public void setFIObuyer(String FIObuyer) {
        this.FIObuyer = FIObuyer;
    }
    public String getFIObuyer() {
        return FIObuyer;
    }

    public String toString() {
        return "Свойства продажи автомобиля:\n" + "Марка автомобиля - " + modelCar + "\nГод выпуска - " + release + "\nЦена автомобиля - " + price + "\nКомплектация - " + equipment + "\nСтрана производитель - " + country + "\nДата продажи - " + dataOfSale + "\nФИО покупателя - " + FIObuyer;
    }

}