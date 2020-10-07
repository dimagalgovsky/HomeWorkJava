package zadanie6;


import java.util.*;

import java.util.stream.Collectors;

import static zadanie6.ReadFile.readAllBytesJava7;

public class WaWMain implements ISearchEngine{
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie6\\Война и мир_книга.txt";
        String data = readAllBytesJava7(filePath);
        data = data.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = data.split("\\s+");

        //System.out.println(WorkData.wordSet(fileArray));
        //System.out.println(WorkData.countWordMap(fileArray));
        System.out.println(WorkData.sortMap(fileArray));
        //System.out.println(WorkData.top10(fileArray));
        //System.out.println(WorkData.search(data, "Анна"));
        //System.out.println(EasySearch.wordIndexOf(data, "Анна"));
    }

    @Override
    public Set wordSet(String[] fileArray) {
        return null;
    }

    @Override
    public Map countWordMap(String[] fileArray) {
        return null;
    }

    @Override
    public List sortMap(String[] fileArray) {
        return null;
    }

    @Override
    public List top10(String[] fileArray) {
        return null;
    }

    @Override
    public long search(String text, String word) {
        return 0;
    }

    @Override
    public long wordIndexOf(String data, String word) {
        return 0;
    }
}