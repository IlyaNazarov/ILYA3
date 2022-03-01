package lesson3;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main (String[] args) {
        String[] arr = {"abs", "ds","ret", "123"};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr);
        System.out.println(Arrays.toString(arr));

        List<String> list = convertToList(arr);
        System.out.println("Task 2\n" + list.getClass() + " : " + list);

        System.out.println("Task 3");
        Box<Orange> OrangeBox = new Box<>();
        Box<Apple> AppleBox = new Box<>();
            OrangeBox.add(new Orange());
            AppleBox.add(new Apple());

        for (int i = 0; i < 4; i++) {
            OrangeBox.add(new Orange());
        }
            for (int i =0; i < 6; i++) {
                AppleBox.add(new Apple());
            }

        OrangeBox.info();
        AppleBox.info();

        float OrangeWeigth = OrangeBox.getWeight();
        float AppleWeigth = AppleBox.getWeight();
        System.out.println("Вес коробки с апельсинами: " + OrangeWeigth);
        System.out.println("Вес коробки с яблоками: " + AppleWeigth);

        System.out.println("Сравнить вес OrangeBox и AppleBox: " + OrangeBox.compare(AppleBox));

                 OrangeBox.moveAt(OrangeBox);

        OrangeBox.info();
        AppleBox.info();

    }

    private static <T> void swapElements(T[] array) {
        T temp = array[2];
        array[2] = array[3];
        array[3] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return  Arrays.asList(array);
    }

}


end