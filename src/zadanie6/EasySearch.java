package zadanie6;

import java.util.HashMap;
import java.util.Map;

import static zadanie6.WorkData.countWordMap;

public class EasySearch implements ISearchEngine {

    public static long wordIndexOf(String data, String word) {
        long count = 0;

        for (int i = 0; i < data.length(); i++) {
            int a = data.indexOf(word, i);
            if (a >= 0){
                count++;
            }
            else break;
            i = a;
        }
        return count;
    }

    @Override
    public long search(String text, String word) {

        long count = 0;

        text = text.replaceAll("[,.-?!-_)(]", "");
        String[] fileArray = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>(countWordMap(fileArray));

        for(Map.Entry<String, Integer> entry: map.entrySet()) {

            String keyWord = entry.getKey();
            Integer valueNum = entry.getValue();

            if (word.hashCode() == keyWord.hashCode()) {
                count = valueNum;
            }
        }
        return count;
    }

    @Override
    public long find1(String data, String word) {
        return 0;
    }
}
