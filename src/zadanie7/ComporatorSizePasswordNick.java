package zadanie7;

import java.util.Comparator;

public class ComporatorSizePasswordNick implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = o1.getPassword().length()-o2.getPassword().length();
        if (result != 0){
            return result;
        }
        else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

