package zadanie7;

import java.util.Comparator;

public class ComporatorSizePassword implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getPassword().length()-o2.getPassword().length();
            return result;
    }
}

