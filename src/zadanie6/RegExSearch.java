package zadanie6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {

    public long find1(String data, String word) {
                long count = 0;
        //      Pattern pattern  = Pattern.compile(word);
        //      Matcher matcher = pattern.matcher(data);

        //      for (int i = 0; i < 1000; i++) {      //тут беда, нужно думать
        //        if (matcher.find(i)) {
        //            count++;
        //        }
        //      }
                 return count;
    }

    @Override
    public long search(String text, String word) {
        return 0;
    }
}
