package zadanie6;

import java.util.*;

public class WorkData {
    public static long search(String text, String word){

        long count = 0;

        text = text.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>(countWordMap(fileArray)); ;

        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (word.hashCode() == key.hashCode()) {
                count = value;
            }
        }
        return count;
    }

    public static Set wordSet(String fileArray[]) {            //set с уникальными словами

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < fileArray.length; i++) {
            if (!set.contains(fileArray[i])) {
                set.add(fileArray[i]);
            }
        }
        return set;
    }

    public static Map countWordMap(String fileArray[]) {       //map с частатой встречания

        Set<String> top10 = new HashSet<>(Arrays.asList(fileArray));
        Map<String, Integer> map = new HashMap<>();
        for (String key : top10) {
            map.put(key, Collections.frequency(Arrays.asList(fileArray), key));
        }
        return map;
    }

    public static List sortMap(String fileArray[]){         //сортировка map по значению

        List list = new ArrayList(countWordMap(fileArray).entrySet());
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
