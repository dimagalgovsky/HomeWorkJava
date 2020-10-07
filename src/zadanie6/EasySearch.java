package zadanie6;

public class EasySearch {
    public static long wordIndexOf(String data, String word){
        long count = 0;

        for (int i = 0; i < data.length(); i++) {
            int a = data.indexOf(word, i);
            if (a>0){
                count++;
            }
            else break;
            i = a;
        }
        return count;

    }
}
