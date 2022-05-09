package MyArrays;

import java.util.*;
import java.util.concurrent.Flow;

public class ArraysClass {
    public static void main(String[] args) {
        Random rnd = new Random();
        int seed = 100;
        printOutOddArray(10);
        List<Integer> integerList = Arrays.asList(rnd.nextInt(seed),
                rnd.nextInt(seed),
                rnd.nextInt(seed),
                rnd.nextInt(seed),
                rnd.nextInt(seed),
                rnd.nextInt(seed),
                rnd.nextInt(seed));
        System.out.printf("Min of %s: %d\n", integerList, Collections.min(integerList));
        System.out.printf("Min of %s: %d\n", integerList, Collections.max(integerList));
        System.out.printf("Swaped max and min elements: %s\n", swapMaxMinElements(integerList));

        int[] integerArray = new int[integerList.size()];
        for (int i = 0; i < integerArray.length; i++){
            integerArray[i] = integerList.get(i);
        }

        System.out.printf("Avg of %s: %d", integerList, findAvgOfArray(integerArray));
    }

    public static void printOutOddArray(Integer arrayLength) {
        String[] oddArray = new String[arrayLength];
        int counter = 1;
        while (arrayLength > 0) {
            if (counter % 2 != 0) {
                oddArray[arrayLength - 1] = (String.valueOf(counter));
                arrayLength--;
            }
            counter++;
        }
        System.out.println(Arrays.toString(oddArray));
    }

    public static List<Integer> swapMaxMinElements(List<Integer> integerArray) {
        int min = Collections.min(integerArray), minIndex = integerArray.indexOf(min);
        int max = Collections.max(integerArray), maxIndex = integerArray.indexOf(max);
        integerArray.set(minIndex, max);
        integerArray.set(maxIndex, min);
        return integerArray;
    }

    public static int findAvgOfArray(int[] integerArray){
        int sum = 0;
        for (int item : integerArray){
            sum += item;
        }
        return sum / integerArray.length;
    }
}
