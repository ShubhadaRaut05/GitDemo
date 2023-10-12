import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Class Demo");
        Car c1=new Car(100000,1200,80);
        Car c2=new Car(500000,1000,120);
        Car c3=new Car(200000,800,100);
        Car c4=new Car(400000,600,60);
        List<Car> carList=new ArrayList<>(Arrays.asList(c1,c2,c3,c4));
        carList.sort(new CarPriceComparator());
        System.out.println(carList);


    }
}