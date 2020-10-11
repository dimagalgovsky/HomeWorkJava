package zadanie7;

import java.util.*;

import static zadanie6.ReadFile.readAllBytesJava7;

public class SortMain {

        private static final Random rand = new Random();
        long timeStart = System.currentTimeMillis();
        public static int sizeMassive = 1_000;
        public static void main(String[] args) {


        ComporatorSizeAgeNick comporatorSizeAgeNick = new ComporatorSizeAgeNick();

//файл для рандома с именами

        String filePath = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie7\\names.txt";
        String data = readAllBytesJava7(filePath);
        data = data.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = data.split("\\s+");

//заполнение LinkedList

        long listLinTime = System.currentTimeMillis();


                LinkedList<Animal> listLin = new LinkedList<Animal>();
                for (int i = 0; i < sizeMassive; i++) {
                    String name = fileArray[rand.nextInt(fileArray.length)];
                    int x = rand.nextInt(100) + 1;
                    listLin.add(new Animal(x, name));
                }


        listLinTime = System.currentTimeMillis()-listLinTime;
        System.out.println("Добавление по 1_000_000 объектов");
        System.out.println("Длительность операции заполнения коллекции LinkedList:" + listLinTime);

//итератор на LinkedList переборка

        long listLinTimeIt = System.currentTimeMillis();
        Iterator<Animal> iterator = listLin.iterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
        listLinTimeIt = System.currentTimeMillis()-listLinTimeIt;
        System.out.println("Длительность операции итерирования коллекции LinkedList:" + listLinTimeIt);

//сортировка LinkedList

        long listLinTimeSort = System.currentTimeMillis();
        listLin.sort(comporatorSizeAgeNick);
        listLinTimeSort = System.currentTimeMillis()-listLinTimeSort;
        System.out.println("Длительность операции сортировки коллекции LinkedList:" + listLinTimeSort);

//итератор на LinkedList удаление

        long listLinTimeItRem = System.currentTimeMillis();
        Iterator<Animal> iteratorDel = listLin.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        listLinTimeItRem = System.currentTimeMillis()-listLinTimeItRem;
        System.out.println("Длительность операции удаление коллекции LinkedList:" + listLinTimeItRem);
        System.out.println(listLin);
//заполнение ArrayList

        long listArrTime = System.currentTimeMillis();
        ArrayList<Animal> listArr = new ArrayList<Animal>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int x = rand.nextInt(100) + 1;
            listArr.add(new Animal(x,name));
        }
        listArrTime = System.currentTimeMillis()-listArrTime;
        System.out.println("Длительность операции заполнения коллекции ArrayList:" + listArrTime);

//сортировка ArrayList

        long listArrTimeSort = System.currentTimeMillis();
        listArr.sort(comporatorSizeAgeNick);
        listArrTimeSort = System.currentTimeMillis()-listArrTimeSort;
        System.out.println("Длительность операции сортировки коллекции ArrayList:" + listArrTimeSort);

//заполнение HashSet

        long setHashTime = System.currentTimeMillis();
        HashSet<Animal> setHash = new HashSet<Animal>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int x = rand.nextInt(100) + 1;
            setHash.add(new Animal(x,name));
        }
        setHashTime = System.currentTimeMillis()-setHashTime;
        System.out.println("Длительность операции заполнения коллекции HashSet:" + setHashTime);

//сортировка HashSet

        long setHashTimeSort = System.currentTimeMillis();
        List<Animal> list = new ArrayList<>(setHash);
        list.sort(comporatorSizeAgeNick);
        setHashTimeSort = System.currentTimeMillis()-setHashTimeSort;
        System.out.println("Длительность операции сортировки коллекции HashSet:" + setHashTimeSort);

//заполнение TreeSet

        long setTreeTime = System.currentTimeMillis();
        TreeSet<Animal> setTree = new TreeSet<Animal>(comporatorSizeAgeNick);
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int x = rand.nextInt(100) + 1;
            setTree.add(new Animal(x,name));
        }
        setTreeTime = System.currentTimeMillis()-setTreeTime;
        System.out.println("Длительность операции заполнения коллекции TreeSet:" + setTreeTime);

//сортировка TreeSet

        long setTreeTimeSort = System.currentTimeMillis();
        List<Animal> list1 = new ArrayList<>(setTree);
        list1.sort(comporatorSizeAgeNick);
        setTreeTimeSort = System.currentTimeMillis()-setTreeTimeSort;
        System.out.println("Длительность операции сортировки коллекции TreeSet:" + setTreeTimeSort);
    }
}
