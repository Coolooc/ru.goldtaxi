import Entity.*;
import Utilities.*;
import java.util.ArrayList;

public class GoldTaxi {
    public static void main(String[] args) {
        ArrayList<Car> CarArrayList = Initialization.initCarArray();
        while (true) {
            Order order = OrderReader.orderRead();
            CarSearch.searchFreeCar(CarArrayList, order);
        }
    }
}
