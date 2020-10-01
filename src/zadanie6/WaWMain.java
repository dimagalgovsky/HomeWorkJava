package zadanie6;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static zadanie6.ReadFile.readAllBytesJava7;

public class WaWMain {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie6\\Война и мир_книга.txt";
        String data = readAllBytesJava7(filePath);
        data = data.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = data.split("\\s+");

        List<String> data1 = new LinkedList<>();
        data1 = Arrays.asList(data.split("\\s+"));

        Set<String> set = new HashSet<String>();
        for (int i = 0; i < fileArray.length; i++) {
            if (!set.contains(fileArray[i])) {
                set.add(fileArray[i]);
            }
        }

        Set<String> top10 = new TreeSet<>(data1);
        Map<String, Integer> map = new TreeMap<>();
        for (String key : top10) {
            map.put(key, Collections.frequency(data1, key));
        }
        

        System.out.println("кол-во уникальных слов: "+set.size());


    }
}