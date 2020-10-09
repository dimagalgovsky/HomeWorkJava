package zadanie4;

import zadanie2.zadacha3.Array;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.copyOf;

public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if (this.data[data.length - 1] != null) {
            boolean result = true;
            for (int i = 0; i < this.data.length; i++) {
                if (this.data[i] == null) {
                    result = false;
                    break;
                }
            }
            if (result) {
                this.data = Arrays.copyOf(data, data.length + 1);
            }
        }

        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {
        if (index > data.length - 1) {
            return null;
        } else {
            T result = data[index];
            return result;
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index) {
        if (index > data.length - 1) {
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++) {
                data[i] = data[i + 1];
            }
            this.data = Arrays.copyOf(this.data, data.length - 1);
        }
        return true;
    }

    public boolean deleteItem(T item) {

        int index = getIndex(item);
        if (index < 0) {
            return false;
        }
        delete(index);
        return true;
    }

    public int getIndex(T item){

        for (int i = 0; i < data.length-1; i++) {
            if (data[i]==item){
                return i;
            }
        }
        return -1;
    }

    public void sort(Comparator<T> comparator) {

        T tmp;
        for (int i = 0; i < this.data.length - 1; i++) {
            for (int j = 0; j < this.data.length - 1; j++) {
                if (comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                    tmp = this.data[j];
                    this.data[j] = this.data[j + 1];
                    this.data[j + 1] = tmp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}





