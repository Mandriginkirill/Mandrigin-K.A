public class Praktika4 {
    public static void main(String[] args) {
        CarLists carLists = new CarLists();
        carLists.Add(new Sport("BMW", 2020 , 7900000 , "M4 Competition","Germany", "18.06.2021", "Иванов Иван Иванович", "3.9-4.2 c.", "3.0 л.", "480 л.с"));
        carLists.Add(new Special("КАМАЗ", 2020, 7100000, "КамАЗ-54901", "Россия", "08.05.2020", "Петров Петр Петрович", "грузовой", "19 700 кг","длина 6250 мм, ширина 3030 мм, высота 1300мм"));
        carLists.Add(new UsedCar("Mazda", 2021, 3060000, "Mazda 6 Supreme Plus", "Япония", "28.08.2021", "Сидоров Евгений Евгеньевич", "отличная", "Кузнецов Виктор Викторович", 131000));

        System.out.println(carLists);
    }

}
