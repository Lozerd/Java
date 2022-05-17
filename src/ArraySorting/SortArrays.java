package ArraySorting;

import java.util.Arrays;
import java.util.Random;

public class SortArrays {
    final static int seed = 1000;
    final static int arraySize = 20;
    static int[] arrayOfIntegers = new int[arraySize];
    static Random rnd = new Random();
    static String[] arrayOfStrings = {
            "BMW", "MERCEDES", "KIA",
            "RENAULT", "PEUGEOT", "FORD",
            "MITSUBISHI", "LAMBORGINI", "FERRARI"
    };

    public static void main(String[] args) {
        for (int i = 0; i < arraySize; ++i) {
            arrayOfIntegers[i] = rnd.nextInt(1, seed);
        }
        System.out.println(Arrays.toString(arrayOfIntegers));
        System.out.println(Arrays.toString(bubbleSort(arrayOfIntegers)));
        System.out.println(Arrays.toString(firstLetterBubbleSort(arrayOfStrings)));
    }

    public static int[] bubbleSort(int[] arrayToSort) {
        for (int i = arrayToSort.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public static String[] firstLetterBubbleSort(String[] arrayToSort) {
        /*
            Method to sort String[] array using compareTo method
            @param arrayToSort String[] array to sort
            @return sorted String[] array by lexicographically following Strings
         */
        for (int i = arrayToSort.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (arrayToSort[j].compareTo(arrayToSort[j + 1]) > 0) {
                    String temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
