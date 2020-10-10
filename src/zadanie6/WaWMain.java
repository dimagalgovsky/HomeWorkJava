package zadanie6;


import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import static zadanie6.ReadFile.readAllBytesJava7;

public class WaWMain {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Dmitriy\\IdeaProjects\\MyHomeWork\\src\\zadanie6\\Война и мир_книга.txt";
        String data = readAllBytesJava7(filePath);
        data = data.replaceAll("[,.-?!-_)(]", "");

        String[] fileArray = data.split("\\s+");

        EasySearch search = new EasySearch();
        WorkData workData = new WorkData();

        //System.out.println(workData.wordSet(fileArray));       //кол-во уникальных слов
        //System.out.println(workData.countWordMap(fileArray));         //кол-во поторений каждого слова
        //System.out.println(workData.sortMap(fileArray));              //сортировка по значению
        //System.out.println(workData.top10(fileArray));               //печать топ 10 повторяющихся слов
        //System.out.println(search.search(data, "Война"));           //кол-во повторений выбранного слова в тексте
        //System.out.println(workData.search(data, "Война"));           //кол-во повторений выбранного слова в тексте без регистра
        //System.out.println(workData.search(data, "и"));
        //System.out.println(workData.search(data, "мир"));
        //System.out.println(search.wordIndexOf(data, "война"));        //поиск по indexOf
        //System.out.println(search.find1(data,"война"));

    }
}

