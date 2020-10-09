package zadanie4.newVariant;

import java.util.Arrays;

public class DataContainerNew<T> {
    private T[] data;

    public void DataContainernew(T[] data) {
        this.data = data;
    }
    public int add(T item){
        if (data[data.length-1] != null){
            data = Arrays.copyOf(data,data.length+1);
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null){
                data[i] = item;
            }
            return i;

        }
        return -1;
    }

    @Override
    public String toString() {
        return "DataContainerNew{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
