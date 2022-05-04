import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Car /*implements Comparable<Car>*/{

    int cost, mileage;
    Car(int cost, int mileage){
        this.cost = cost;
        this.mileage = mileage;
    }

//    @Override
//    public int compareTo(Car c) {
//        if(this.cost > c.cost) return 1;
//        else if(this.cost < c.cost) return -1;
//        return 0;
//    }
}

class CarComparator implements Comparator<Car>{

    @Override
    public int compare(Car c1, Car c2) {
        if(c1.mileage > c2.mileage) return -1;
        else if(c1.mileage < c2.mileage) return 1;
        return 0;
    }
}

public class ComparatorProgram {
    public static void main(String[] args) {
        Car ref;
        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car(400000, 42));
        carList.add(new Car(100000, 12));
        carList.add(new Car(300000, 32));
        carList.add(new Car(500000, 52));
        carList.add(new Car(200000, 22));

        carList.sort(new CarComparator());
        Iterator<Car> carIterator = carList.iterator();
        while (carIterator.hasNext()){
            ref = carIterator.next();
            System.out.println(ref.cost + " " + ref.mileage);
        }
    }
}
