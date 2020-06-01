package lesson1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    Integer[] arr = new Integer[4];
    int x;

    // заполняем массив
    public void Example() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
    }

    // меняем первые два элемента местами
    public void changeExample() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            arr[0] = x;
            arr[0] = arr[1];
            arr[1] = x;
            System.out.print(arr[i] + " ");
        }

    }
    // метод преобразующий массив в ArrayList
    public void toArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length ; i++) {
            arr [i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr.getClass());
        list = Arrays.asList(arr);
        System.out.println(list.getClass());

    }
}

class Main {
    public static void main(String[] args) {
        Example example = new Example();
        example.Example();
        System.out.println();
        example.changeExample();
        System.out.println();
        example.toArrayList();
    }
}
