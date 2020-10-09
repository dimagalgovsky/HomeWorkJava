package zadanie4;

import java.util.Comparator;
import java.util.Scanner;


public class DataMain {
    public static void main(String[] args) {

        DataContainer<Integer> container = new DataContainer(new Integer[]{null, null, 1, null ,4});

        container.add(44);
        container.add(0);
        container.add(1);
        container.add(2);
        container.add(454);
        container.add(0);
    //
    //    container.getItems();
    //    container.delete(90);
    //    container.deleteItem(44);
    //    container.sort(Integer::compareTo);
    //
        System.out.println(container.get(2));
    //    System.out.println(container.toString());




    }
}
