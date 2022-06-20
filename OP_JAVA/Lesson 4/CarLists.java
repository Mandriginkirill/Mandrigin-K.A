import java.util.ArrayList;
public class CarLists {
    private ArrayList<Car> avto;

    public CarLists() {
        avto = new ArrayList<Car>();
    }

    public void Add(Car auto) {
        avto.add(auto);
    }

    public String toString() {
        String str = "";
        for (int i=0; i<avto.size(); i++) {
            str+=avto.get(i);
            str+="\n\n";
        }
        return str;
    }

}
