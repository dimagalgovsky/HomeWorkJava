package zadanie6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ISearchEngine {
    long search(String text, String word);
    Set word(String fileArray[]);
    Map countWord(String fileArray[]);
    List sortMap(String fileArray[]);
    List top10(String fileArray[]);

}
