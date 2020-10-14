package zadanie7;

import java.util.*;

import static zadanie6.ReadFile.readAllBytesJava7;
import static zadanie7.RandomPassword.nextString;


public class Main1{

    private static final Random rand = new Random();
    public static final int sizeMassive = 1_00;
    public static final int maxSizeAge = 100;
    public static final int maxSizePassword = 10;

    public static final String personWay = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie7\\names.txt";        //изменить адреса
    public static final String animalWay = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie7\\pet_niks.txt";

    public static ComporatorSizeAge comporatorSizeAge = new ComporatorSizeAge();
    public static ComporatorSizeAgeNick comporatorSizeAgeNick = new ComporatorSizeAgeNick();
    public static ComporatorSizePassword comporatorSizePassword = new ComporatorSizePassword();
    public static ComporatorSizePasswordNick comporatorSizePasswordNick = new ComporatorSizePasswordNick();

    public static String[] randNick(String way) {

        String data = readAllBytesJava7(way);
        data = data.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = data.split("\\s+");
        return fileArray;
    }

//заполнение LinkedList Animal
    public static LinkedList<Animal> linkListAnimal (String[] fileArray, int sizeMassive, int maxSizeAge) {

        LinkedList<Animal> linkListAnimal = new LinkedList<Animal>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int age = rand.nextInt(maxSizeAge) + 1;
            linkListAnimal.add(new Animal(age, name));
        }
        return linkListAnimal;
    }

//заполнение LinkedList Person
    public static LinkedList<Person> linkListPerson (String[] fileArray, int sizeMassive, int maxSizePassword) {

      LinkedList<Person> linkListPerson = new LinkedList<Person>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            String password = nextString(maxSizePassword);
            linkListPerson.add(new Person(name, password));
        }
        return linkListPerson;
    }

//заполнение ArrayList Animal
    public static ArrayList<Animal> arrayListAnimal(String[] fileArray, int sizeMassive, int maxSizeAge){

        ArrayList<Animal> arrayListAnimal = new ArrayList<Animal>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int age = rand.nextInt(maxSizeAge) + 1;
            arrayListAnimal.add(new Animal(age,name));
        }
     return arrayListAnimal;
    }

//заполнение ArrayList Person
    public static ArrayList<Person> arrayListPerson (String[] fileArray, int sizeMassive, int maxSizePassword) {

        ArrayList<Person> arrayListPerson = new ArrayList<Person>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            String password = nextString(maxSizePassword);
            arrayListPerson.add(new Person(name, password));
        }
        return arrayListPerson;
    }

//зыполнение HashSet Animal;
    public static HashSet<Animal> hashSetAnimal (String[] fileArray, int sizeMassive, int maxSizeAge){

        HashSet<Animal> hashSetAnimal = new HashSet<Animal>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int age = rand.nextInt(maxSizeAge) + 1;
            hashSetAnimal.add(new Animal(age,name));
        }
        return hashSetAnimal;
    }

//зыполнение HashSet Person;
    public static HashSet<Person> hashSetPerson (String[] fileArray, int sizeMassive, int maxSizePassword){

        HashSet<Person> hashSetPerson = new HashSet<Person>();
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            String password = nextString(maxSizePassword);
            hashSetPerson.add(new Person(name, password));
        }
        return hashSetPerson;
    }

//заполнение TreeSet Animal
    public static TreeSet<Animal> treeSetAnimal (String[] fileArray, int sizeMassive, int maxSizeAge) {

        TreeSet<Animal> treeSetAnimal = new TreeSet<Animal>(comporatorSizeAgeNick);
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            int age = rand.nextInt(maxSizeAge) + 1;
            treeSetAnimal.add(new Animal(age, name));
        }
        return treeSetAnimal;
    }

//заполнение TreeSet Person
    public static TreeSet<Person> treeSetPerson (String[] fileArray, int sizeMassive, int maxSizePassword) {

        TreeSet<Person> treeSetPerson = new TreeSet<Person>(comporatorSizePasswordNick);
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            String password = nextString(maxSizePassword);
            treeSetPerson.add(new Person(name, password));
        }
        return treeSetPerson;
    }

//вывод в консоль времени заполнения
    public static void timeWorkAdd() {

        long[] arr1 = new long[4];
        long[] arr2 = new long[4];

        long setTreeTime = System.currentTimeMillis();
        linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        arr1[0] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        arr1[1] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        arr1[2] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        arr1[3] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        linkListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        arr2[0] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        arr2[1] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword);
        arr2[2] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword);
        arr2[3] = (System.currentTimeMillis()-setTreeTime);

        String name = "Время заполнение коллекций классов Animal и Person";
        printResult(arr1,arr2,name);

    }

//выводит результаты в консоль
    public static void printResult(long[] arr1,long[] arr2, String name){
        System.out.println(name);
        System.out.println("Класс"+"\t"+"LinkedList"+"\t"+"ArrayList"+"\t"+"HashSet"+"\t\t"+"TreeSet ");
        System.out.print("Animal"+"\t");
        for (long i : arr1) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : arr2) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
    }

//создание коллекций, для дальнейших работ с ними
    public static LinkedList linkA = new LinkedList(linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
    public static ArrayList arrA = new ArrayList(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
    public static HashSet hSetA = new HashSet(hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
    public static TreeSet tSetA = new TreeSet(treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
    public static LinkedList linkP = new LinkedList(linkListPerson(randNick(personWay),sizeMassive,maxSizePassword));
    public static ArrayList arrP = new ArrayList(arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword));
    public static HashSet hSetP = new HashSet(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
    public static TreeSet tSetP = new TreeSet(treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword));

//сортировка коллекций
    public static void sortCollect(){

        linkA.sort(comporatorSizeAgeNick);
        arrA.sort(comporatorSizeAgeNick);
        List<Animal> listA = new ArrayList<>(hSetA);
        listA.sort(comporatorSizeAgeNick);
        //tSetA                                     //уже отсортирован

        linkP.sort(comporatorSizePasswordNick);
        arrP.sort(comporatorSizePasswordNick);
        List<Person> listP = new ArrayList<>(hSetP);
        listP.sort(comporatorSizePasswordNick);
        //tSetP                                     //уже отсортирован
    }

//метод итератора Iterator
    public static long iterator (Collection collection){
        long setTime = System.currentTimeMillis();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
        return (System.currentTimeMillis()-setTime);
    }

//метод итератора For
    public static long iteratorFor (Collection collection){
        long setTime = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            collection.equals(i);
        }
        return (System.currentTimeMillis()-setTime);
    }

//метод итератора remove
    public static long iteratorRemove (Collection collection){
        long setTime = System.currentTimeMillis();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        return (System.currentTimeMillis()-setTime);
    }

//метод итератора For remove
    public static long iteratorForRemove (Collection collection){
        long setTime = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            collection.remove(i);
        }
        return (System.currentTimeMillis()-setTime);
    }

//расчет времени выполнения итерирования (Iterator)
    public static void timeWorkIterator(){

        long[] arr1 = new long[4];
        long[] arr2 = new long[4];

        arr1[0] = iterator(linkA);
        arr1[1] = iterator(arrA);
        arr1[2] = iterator(hSetA);
        arr1[3] = iterator(tSetA);

        arr2[0] = iterator(linkP);
        arr2[1] = iterator(arrP);
        arr2[2] = iterator(hSetP);
        arr2[3] = iterator(tSetP);

        String name = "Время выполнения итерирования(через iterator) коллекций классов Animal и Person";
        printResult(arr1,arr2,name);
    }

//расчет времени выполнения итерирования (For)
    public static void timeWorkIteratorFor(){

        long[] arr1 = new long[4];
        long[] arr2 = new long[4];

        arr1[0] = iteratorFor(linkA);
        arr1[1] = iteratorFor(arrA);
        arr1[2] = iteratorFor(hSetA);
        arr1[3] = iteratorFor(tSetA);

        arr2[0] = iteratorFor(linkP);
        arr2[1] = iteratorFor(arrP);
        arr2[2] = iteratorFor(hSetP);
        arr2[3] = iteratorFor(tSetP);

        String name = "Время выполнения итерирования(через for) коллекций классов Animal и Person";
        printResult(arr1,arr2,name);
    }

//расчет времени удаление элементов итерирования (Iterator)
    public static void timeWorkIteratorRemove(){

        long[] arr1 = new long[4];
        long[] arr2 = new long[4];

        arr1[0] = iteratorRemove(linkA);
        arr1[1] = iteratorRemove(arrA);
        arr1[2] = iteratorRemove(hSetA);
        arr1[3] = iteratorRemove(tSetA);

        arr2[0] = iteratorRemove(linkP);
        arr2[1] = iteratorRemove(arrP);
        arr2[2] = iteratorRemove(hSetP);
        arr2[3] = iteratorRemove(tSetP);

        String name = "Время выполнения удаление элементов(через iterator) коллекций классов Animal и Person";
        printResult(arr1,arr2,name);
    }

//расчет времени удаление элементов итерирования (For)
    public static void timeWorkIteratorForRemove(){

        long[] arr1 = new long[4];
        long[] arr2 = new long[4];

        arr1[0] = iteratorForRemove(linkA);
        arr1[1] = iteratorForRemove(arrA);
        arr1[2] = iteratorForRemove(hSetA);
        //arr1[3] = iteratorForRemove(tSetA);

        arr2[0] = iteratorForRemove(linkP);
        arr2[1] = iteratorForRemove(arrP);
        arr2[2] = iteratorForRemove(hSetP);
        //arr2[3] = iteratorForRemove(tSetP);

        String name = "Время выполнения итерирования(через for) коллекций классов Animal и Person";
        printResult(arr1,arr2,name);
    }

        public static  void main(String[] args) {

//методы для заполнения коллекций
        //linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        //arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        //hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        //treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        //linkListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        //arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        //hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword);
        //treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword);

//сортировка коллекций
        //sortCollect();
//вывод в печать время заполнения коллекций
        //timeWorkAdd();
//вывод в печать время итерирования коллекций(Iterator)
        //timeWorkIterator();
//вывод в печать время итерирования коллекций(for)
        //timeWorkIteratorFor();
//вывод в печать время удаление итерирования коллекций(Iterator)
        //timeWorkIteratorRemove();
//вывод в печать время удаление итерирования коллекций(For)
        timeWorkIteratorForRemove();                          //не работает treeset


            /*
   Время на заполнение коллекций:
Класс	    LinkedList	    ArrayList	    HashSet		    TreeSet
Animal	    160			    84			    452			    760
Person	    445			    322			    786			    1427

Время на итерирование коллекции:
Animal	    15			    8			    31			    6
Person	    7			    10			    21			    7

Время на итерирование коллекции(через fori):
Animal	    471166			8			    6			    6
Person	    476180			8			    6			    5

Время на удаление элементов через итерирование коллекции:
Animal	    21			    52511			32			    13
Person	    14			    51592			30			    12

Время на удаление через итерирование коллекции(через fori):
Animal	    210598			26065			144			    3
Person	    202375			25689			21			    5
             */
    }
}