package zadanie7;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

import static zadanie6.ReadFile.readAllBytesJava7;
import static zadanie7.RandomPassword.nextString;


public class Main1{

    private static final Random rand = new Random();
    public static final int sizeMassive = 1_00000;
    public static final int maxSizeAge = 100;
    public static final int maxSizePassword = 10;

    public static final String personWay = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie7\\names.txt";
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

//заполнение TreeSet Animal
    public static TreeSet<Person> treeSetPerson (String[] fileArray, int sizeMassive, int maxSizePassword) {

        TreeSet<Person> treeSetPerson = new TreeSet<Person>(comporatorSizePasswordNick);
        for (int i = 0; i < sizeMassive; i++) {
            String name = fileArray[rand.nextInt(fileArray.length)];
            String password = nextString(maxSizePassword);
            treeSetPerson.add(new Person(name, password));
        }
        return treeSetPerson;
    }

//сортировка коллекций
    public static void sortCollect(){

        linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge).sort(comporatorSizeAgeNick);
        arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge).sort(comporatorSizeAgeNick);
        List<Animal> listA = new ArrayList<>(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        listA.sort(comporatorSizeAgeNick);
        //treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);    //уже отсортирован

        linkListPerson(randNick(personWay),sizeMassive,maxSizePassword).sort(comporatorSizePasswordNick);
        arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword).sort(comporatorSizePasswordNick);
        List<Person> listP = new ArrayList<>(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        listP.sort(comporatorSizePasswordNick);
        //treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword); //уже отсортирован
    }

//вывод в консоль времени заполнения
    public static void timeWorkAdd() {

//расчет времени выполнения заполнения Animal
        long[] addListAnimal = new long[4];

        long setTreeTime = System.currentTimeMillis();
        linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        addListAnimal[0] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        addListAnimal[1] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        addListAnimal[2] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge);
        addListAnimal[3] = (System.currentTimeMillis()-setTreeTime);

//расчет времени выполнения заполнения Animal
        long[] addListPerson = new long[4];

        setTreeTime = System.currentTimeMillis();
        linkListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        addListPerson[0] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword);
        addListPerson[1] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword);
        addListPerson[2] = (System.currentTimeMillis()-setTreeTime);

        setTreeTime = System.currentTimeMillis();
        treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword);
        addListPerson[3] = (System.currentTimeMillis()-setTreeTime);

        System.out.println("Время на заполнение коллекций:");
        System.out.println("Класс"+"\t"+"LinkedList"+"\t"+"ArrayList"+"\t"+"HashSet"+"\t\t"+"TreeSet ");
        System.out.print("Animal"+"\t");
        for (long i : addListAnimal) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : addListPerson) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
    }

    public static void timeWorkIterator(){

//расчет времени выполнения итерирования Animal(Iterator)
        long[] iterListAnimal = new long[4];

        LinkedList linkA = new LinkedList(linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        long setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorLlA = linkA.iterator();
        while(iteratorLlA.hasNext()) {
            iteratorLlA.next();
        }
        iterListAnimal[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrA = new ArrayList(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorALA = arrA.iterator();
        while(iteratorALA.hasNext()) {
            iteratorALA.next();
        }
        iterListAnimal[1] = (System.currentTimeMillis()-setTreeTime);

       HashSet hSetA = new HashSet(hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
       setTreeTime = System.currentTimeMillis();
       Iterator<Animal> iteratorHSA = hSetA.iterator();
       while(iteratorHSA.hasNext()) {
           iteratorHSA.next();
       }
       iterListAnimal[2] = (System.currentTimeMillis()-setTreeTime);

       TreeSet tSetA = new TreeSet(treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
       setTreeTime = System.currentTimeMillis();
       Iterator<Animal> iteratorTSA = tSetA.iterator();
       while(iteratorTSA.hasNext()) {
           iteratorTSA.next();
       }
       iterListAnimal[3] = (System.currentTimeMillis()-setTreeTime);

//расчет времени выполнения итерирования Person(Iterator)
        long[] iterListPerson = new long[4];

        LinkedList linkP = new LinkedList(linkListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorLlP = linkP.iterator();
        while(iteratorLlP.hasNext()) {
            iteratorLlP.next();
        }
        iterListPerson[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrP = new ArrayList(arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorALP = arrP.iterator();
        while(iteratorALP.hasNext()) {
            iteratorALP.next();
        }
        iterListPerson[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetP = new HashSet(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorHSP = hSetP.iterator();
        while(iteratorHSP.hasNext()) {
            iteratorHSP.next();
        }
        iterListPerson[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetP = new TreeSet(treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorTSP = tSetP.iterator();
          while(iteratorTSP.hasNext()) {
              iteratorTSP.next();
          }
        iterListPerson[3] = (System.currentTimeMillis()-setTreeTime);

        System.out.println("Время на итерирование коллекции:");
        System.out.print("Animal"+"\t");
        for (long i :iterListAnimal) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : iterListPerson) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();

    }


public static void timeWorkIteratorFor(){

//расчет времени выполнения итерирования Animal(Iterator)
        long[] iterListAnimal = new long[4];

        LinkedList linkA = new LinkedList(linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        long setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorLlA = linkA.iterator();
        for (int i = 0; i < linkA.size(); i++) {
            linkA.get(i);
        }
        iterListAnimal[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrA = new ArrayList(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < arrA.size(); i++) {
            arrA.get(i);
        }
        iterListAnimal[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetA = new HashSet(hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < hSetA.size(); i++) {
            hSetA.isEmpty();
        }
        iterListAnimal[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetA = new TreeSet(treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < tSetA.size(); i++) {
            tSetA.isEmpty();
        }
        iterListAnimal[3] = (System.currentTimeMillis()-setTreeTime);

//расчет времени выполнения итерирования Person(Iterator)
        long[] iterListPerson = new long[4];

        LinkedList linkP = new LinkedList(linkListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < linkP.size(); i++) {
        linkP.get(i);
        }
        iterListPerson[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrP = new ArrayList(arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < arrP.size(); i++) {
        arrP.get(i);
        }
        iterListPerson[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetP = new HashSet(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < hSetP.size(); i++) {
        hSetP.isEmpty();
        }
        iterListPerson[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetP = new TreeSet(treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < tSetP.size(); i++) {
        tSetP.isEmpty();
        }
        iterListPerson[3] = (System.currentTimeMillis()-setTreeTime);

        System.out.println("Время на итерирование коллекции(через fori):");
        System.out.print("Animal"+"\t");
        for (long i :iterListAnimal) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : iterListPerson) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();

    }


//время удаления элементов
    public static void timeWorkIteratorRemove(){

//расчет времени выполнения итерирования Animal(Iterator)
        long[] iterListAnimal = new long[4];

        LinkedList linkA = new LinkedList(linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        long setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorLlA = linkA.iterator();
        while(iteratorLlA.hasNext()) {
            iteratorLlA.next();
            iteratorLlA.remove();
        }
        iterListAnimal[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrA = new ArrayList(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorALA = arrA.iterator();
        while(iteratorALA.hasNext()) {
            iteratorALA.next();
            iteratorALA.remove();
        }
        iterListAnimal[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetA = new HashSet(hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorHSA = hSetA.iterator();
        while(iteratorHSA.hasNext()) {
            iteratorHSA.next();
            iteratorHSA.remove();
        }
        iterListAnimal[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetA = new TreeSet(treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorTSA = tSetA.iterator();
        while(iteratorTSA.hasNext()) {
            iteratorTSA.next();
            iteratorTSA.remove();
        }
        iterListAnimal[3] = (System.currentTimeMillis()-setTreeTime);

//расчет времени выполнения итерирования Person(Iterator)
        long[] iterListPerson = new long[4];

        LinkedList linkP = new LinkedList(linkListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorLlP = linkP.iterator();
        while(iteratorLlP.hasNext()) {
            iteratorLlP.next();
            iteratorLlP.remove();
        }
        iterListPerson[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrP = new ArrayList(arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorALP = arrP.iterator();
        while(iteratorALP.hasNext()) {
            iteratorALP.next();
            iteratorALP.remove();
        }
        iterListPerson[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetP = new HashSet(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorHSP = hSetP.iterator();
        while(iteratorHSP.hasNext()) {
            iteratorHSP.next();
            iteratorHSP.remove();
        }
        iterListPerson[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetP = new TreeSet(treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        Iterator<Person> iteratorTSP = tSetP.iterator();
        while(iteratorTSP.hasNext()) {
            iteratorTSP.next();
            iteratorTSP.remove();
        }
        iterListPerson[3] = (System.currentTimeMillis()-setTreeTime);

        System.out.println("Время на удаление элементов через итерирование коллекции:");
        System.out.print("Animal"+"\t");
        for (long i :iterListAnimal) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : iterListPerson) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();

    }


    public static void timeWorkIteratorForRemove(){

//расчет времени выполнения итерирования Animal(Iterator)
        long[] iterListAnimal = new long[4];

        LinkedList linkA = new LinkedList(linkListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        long setTreeTime = System.currentTimeMillis();
        Iterator<Animal> iteratorLlA = linkA.iterator();
        for (int i = 0; i < linkA.size(); i++) {
            linkA.remove(i);
        }
        iterListAnimal[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrA = new ArrayList(arrayListAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < arrA.size(); i++) {
            arrA.remove(i);
        }
        iterListAnimal[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetA = new HashSet(hashSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < hSetA.size(); i++) {
            hSetA.remove(i);
        }
        iterListAnimal[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetA = new TreeSet(treeSetAnimal(randNick(animalWay),sizeMassive,maxSizeAge));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < tSetA.size(); i++) {
            //tSetA.remove(i);
        }
        iterListAnimal[3] = (System.currentTimeMillis()-setTreeTime);

//расчет времени выполнения итерирования Person(Iterator)
        long[] iterListPerson = new long[4];

        LinkedList linkP = new LinkedList(linkListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < linkP.size(); i++) {
            linkP.remove(i);
        }
        iterListPerson[0] = (System.currentTimeMillis()-setTreeTime);

        ArrayList arrP = new ArrayList(arrayListPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < arrP.size(); i++) {
            arrP.remove(i);
        }
        iterListPerson[1] = (System.currentTimeMillis()-setTreeTime);

        HashSet hSetP = new HashSet(hashSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < hSetP.size(); i++) {
            hSetP.remove(i);
        }
        iterListPerson[2] = (System.currentTimeMillis()-setTreeTime);

        TreeSet tSetP = new TreeSet(treeSetPerson(randNick(personWay),sizeMassive,maxSizePassword));
        setTreeTime = System.currentTimeMillis();
        for (int i = 0; i < tSetP.size(); i++) {
            //tSetP.remove(i);
        }
        iterListPerson[3] = (System.currentTimeMillis()-setTreeTime);

        System.out.println("Время на удаление через итерирование коллекции(через fori):");
        System.out.print("Animal"+"\t");
        for (long i :iterListAnimal) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();
        System.out.print("Person"+"\t");
        for (long i : iterListPerson) {
            System.out.print(i+"\t\t\t");
        }
        System.out.println();

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
        ///timeWorkAdd();
//вывод в печать время итерирования коллекций(Iterator)
        //timeWorkIterator();
//вывод в печать время итерирования коллекций(for)
        //timeWorkIteratorFor();
//вывод в печать время удаление итерирования коллекций(Iterator)
        //timeWorkIteratorRemove();
//вывод в печать время удаление итерирования коллекций(For)
        //timeWorkIteratorForRemove();

        //необходима оптимизация кода, нужно переиспользовать, сократить
    }
}
