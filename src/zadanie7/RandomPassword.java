package zadanie7;

import java.util.Random;

public class RandomPassword {
    private static final char[] allLetters = ("qwertyuiopasdfghjklzxcvbnm" +
                                        "QWERTYUIOPASDFGHJKLZXCVBNM" +
                                      "1234567890")
                                        .toCharArray();
    private static final Random random = new Random();

    public static String nextString(int length) {
        int random_number  = 4 + random.nextInt(length-4);
        StringBuilder builder = new StringBuilder(random_number);

        for (int i = 0; i <= random_number; i++) {
            builder.append(allLetters[random.nextInt(allLetters.length)]);
        }
        return builder.toString();
    }
}
