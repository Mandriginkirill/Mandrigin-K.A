public class Car {

    private String modelCar;
    private int release;
    private int price;
    private String equipment;
    private String country;
    private String dataOfSale;
    private String FIObuyer;


    void setRelease(int release) {
        this.release = release;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setDataOfSale(String dataOfSale) {
        this.dataOfSale = dataOfSale;
    }

    void setFIObuyer(String FIObuyer) {
        this.FIObuyer = FIObuyer;
    }

    Car(String modelCar){
        this.modelCar = modelCar;
    }

    public String toString() {
        return "Свойства продажи автомобиля:\n" + "Марка автомобиля - " + this.modelCar + "\nГод выпуска - " + this.release + "\nЦена автомобиля - " + this.price + "\nКомплектация - " + this.equipment + "\nСтрана производитель - " + this.country + "\nДата продажи - " + this.dataOfSale + "\nФИО покупателя - " + this.FIObuyer;
    }

}