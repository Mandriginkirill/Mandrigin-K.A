public class Praktika3 {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        car.setRelease(2021);
        car.setPrice(12000000);
        car.setEquipment("X7");
        car.setCountry("Германия");
        car.setDataOfSale("8.05.2021");
        car.setFIObuyer("Иванов Иван Иванович");

        System.out.println(car.toString());
    }

}
