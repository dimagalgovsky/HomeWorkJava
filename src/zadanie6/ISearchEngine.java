package zadanie6;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ISearchEngine {

    Set wordSet(String fileArray[]);
    Map countWordMap(String fileArray[]);
    List sortMap(String fileArray[]);
    List top10(String fileArray[]);
    long search(String text, String word);
    long wordIndexOf(String data, String word);
}
