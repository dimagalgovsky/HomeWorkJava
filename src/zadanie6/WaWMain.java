package zadanie6;


import java.util.*;

import java.util.stream.Collectors;

import static zadanie6.ReadFile.readAllBytesJava7;

public class WaWMain{
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie6\\Война и мир_книга.txt";
        String data = readAllBytesJava7(filePath);
        data = data.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = data.split("\\s+");

        //System.out.println(word(fileArray));
        //System.out.println(countWord(fileArray));
        //System.out.println(sortMap(fileArray));
        //System.out.println(top10(fileArray));
        //System.out.println(search(data, "Анна"));
    }

    public static long search(String text, String word){

        long count = 0;

        text = text.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>(countWord(fileArray)); ;

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (word.hashCode() == key.hashCode()) {
                count = value;
            }
        }
        return count;
    }

    public static Set word(String fileArray[]) {            //set с уникальными словами

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < fileArray.length; i++) {
            if (!set.contains(fileArray[i])) {
                set.add(fileArray[i]);
            }
        }
        return set;
    }

    public static Map countWord(String fileArray[]) {       //map с частатой встречания

        Set<String> top10 = new HashSet<>(Arrays.asList(fileArray));
        Map<String, Integer> map = new HashMap<>();
        for (String key : top10) {
            map.put(key, Collections.frequency(Arrays.asList(fileArray), key));
        }
        return map;
    }

    public static List sortMap(String fileArray[]){         //сортировка map по значению

        List list = new ArrayList(countWord(fileArray).entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
                return a.getValue() - b.getValue();
            }
        });
        return list;
    }

    public static List top10(String fileArray[]) {          //топ10 повторяющихся слов

        List list = new ArrayList(sortMap(fileArray));
        List list1 = new ArrayList();

        for (int j = list.size() - 1; j > list.size() - 11; j--) {
            list1.add(list.get(j));
        }
        return list1;
    }
}