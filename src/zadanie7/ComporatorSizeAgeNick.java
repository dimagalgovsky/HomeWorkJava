package zadanie7;

import java.util.Comparator;

public class ComporatorSizeAgeNick implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.getAge()-o2.getAge();
        if (result != 0){
            return result;
        }
        else {
            return o1.getNick().compareTo(o2.getNick());
        }
    }
}

