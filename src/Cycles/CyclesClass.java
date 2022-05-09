package Cycles;

import java.util.ArrayList;
import java.util.Objects;

public class CyclesClass {
    public static void main(String[] args) {
        System.out.print("oddNumberFromRange: ");
        oddNumberFromRange(1, 99);
        System.out.printf("Factorial of 10: %23d\n", factorial(10));
        System.out.printf("Factorial of 10 (forloop cycle): %d\n", forLoopFactorial(10));

        whileCycleOddNumberFromRange(1, 99);
        System.out.printf("Factorial of 10 (while cycle): %d\n", whileCycleFactorial(10));
        System.out.printf("10 to the power of 20 is: %.2f\n", Math.pow(10, 10));
        getNumbersFromArithmeticProgression(0, -5, 10);

        searchIntegerInProgression(getIntegerArrayFromArithmeticProgression(0, -5, 10), "5", 2);
    }

    public static void oddNumberFromRange(Integer rangeStart, Integer rangeEnd) {
        for (int i = rangeStart; i < rangeEnd + 1; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }

    public static int factorial(Integer n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int forLoopFactorial(Integer n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void whileCycleOddNumberFromRange(Integer startRange, Integer endRange) {
        System.out.print("whileCycleOddNumberFromRange: ");
        while (!startRange.equals(endRange + 1)) {
            if (startRange % 2 != 0) {
                System.out.printf("%d ", startRange);
            }
            startRange++;
        }
        System.out.println();
    }

    public static int whileCycleFactorial(Integer n){
        int result = 1;
        while (n > 0){
            result *= n;
            n--;
        }
        return result;
    }

    public static void getNumbersFromArithmeticProgression(Integer progressionStart, Integer progressionOffset, Integer progressionCount){
        while (progressionCount > 0){
            System.out.printf("%d ", progressionStart += progressionOffset);
            progressionCount--;
        }
        System.out.println();
    }
    public static String[] getIntegerArrayFromArithmeticProgression(Integer progressionStart, Integer progressionOffset, Integer progressionCount){
        String[] arrayOfStrings = new String[progressionCount];
        while (progressionCount > 0){
            progressionStart += progressionOffset;
            arrayOfStrings[progressionCount - 1] = String.valueOf(progressionStart);
            progressionCount--;
        }
        return arrayOfStrings;
    }

    public static void searchIntegerInProgression(String[] arrayToSearch, String stringToSearch, Integer timesSeen){
        int internalTimesSeen = 0;  // For future use of timesSeen value
        for (String arrayString : arrayToSearch) {
            if (timesSeen == internalTimesSeen) {
                System.out.printf("Found string \"%s\", %s times", stringToSearch, timesSeen);
                break;
            }
            if (arrayString.contains(stringToSearch)) {
                internalTimesSeen++;
            }
        }
    }
}
