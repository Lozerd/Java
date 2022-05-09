package Statements;

import org.jetbrains.annotations.NotNull;

import java.text.DateFormatSymbols;
import java.util.*;

public class ConditionalStatements {
    public static void main(String @NotNull [] args) {
        int seed = 100;
        Random rnd = new Random(args.length == 0 ? seed : Integer.parseInt(args[0]));

        List<Integer> listOfNumbers = List.of(rnd.nextInt(seed), rnd.nextInt(seed), rnd.nextInt(seed), rnd.nextInt(seed));
        TaskOne(listOfNumbers);

        TaskTwo();

        listOfNumbers = List.of(rnd.nextInt(seed), rnd.nextInt(seed), rnd.nextInt(seed), rnd.nextInt(seed), rnd.nextInt(seed));
        TaskThree(listOfNumbers);

        TaskFour("Sergey", "Alexander");

        TaskFive(4);
    }

    public static void TaskOne(@NotNull List<Integer> listOfNumbers) {
        /*
            Given an Integer array of length 4, print out min and max Integer of that array
         */
        if (listOfNumbers.size() != 4) {
            throw new IllegalArgumentException("first argument must contain exactly 4 elements");
        }
        System.out.printf(
                "listOfNumbers: %s\nMin: %d; Max: %d\n",
                listOfNumbers,
                Collections.min(listOfNumbers),
                Collections.max(listOfNumbers)
        );
    }

    public static void TaskTwo() {
        /*
            Return amount of max numbers in Integer array
         */
        System.out.println("There always going to be one \"max\" number in array");
    }

    public static void TaskThree(@NotNull List<Integer> listOfNumbers) {
        /*
            Given an Integer array of length 4, print out max Integer in array, then the min one
         */
        if (listOfNumbers.size() != 5) {
            throw new IllegalArgumentException("first argument must contain exactly 5 elements");
        }

        System.out.printf(
                "listOfNumbers: %s, Max: %d; Min: %d;\n",
                listOfNumbers,
                Collections.max(listOfNumbers),
                Collections.min(listOfNumbers)
        );
    }

    public static void TaskFour(@NotNull String firstPersonName, String secondPersonName) {
        /*
            Confirm if two strings (presumably names) are namesakes. Print it out
         */
        System.out.printf("%s и %s - %s\n",
                firstPersonName,
                secondPersonName,
                firstPersonName.equals(secondPersonName) ? "Люди являются тёзками" : "Люди не являются тёзками"
        );
    }

    public static void TaskFive(Integer monthNumber) {
        /*
            Given month number, return month name
         */
        if (monthNumber <= 0) {
            throw new IllegalArgumentException("month number cannot less or equal to 0");
        }
        System.out.printf("%d(th) Month is %s\n", monthNumber, new DateFormatSymbols().getMonths()[monthNumber - 1]);
    }
}
