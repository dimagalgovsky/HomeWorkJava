package zadanie7;

import java.util.Comparator;

public class ComporatorSizeAge implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        int result = o1.getAge()-o2.getAge();
            return result;

    }
}

