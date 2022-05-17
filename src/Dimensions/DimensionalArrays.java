package Dimensions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DimensionalArrays {
    final static int arrayRows = 6;
    final static int arrayColumns = 5;
    final static int seed = 99;
    static int[][] arrayOfNumbers = new int[arrayRows][arrayColumns];
    static Random rnd = new Random();
    static int[][] matrixC = {
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),},
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),},
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),}
    };

    static int[][] matrixD = {
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),},
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),},
            {rnd.nextInt(0, 99), rnd.nextInt(0, 99), rnd.nextInt(0, 99),}
    };

    static int[][] negativePositiveArray = {
            {rnd.nextInt(0, seed), rnd.nextInt(-seed, 0), rnd.nextInt(0, seed), },
            {rnd.nextInt(-seed, 0), rnd.nextInt(0, seed), rnd.nextInt(-seed, 0), },
            {rnd.nextInt(-seed, 0), rnd.nextInt(0, seed), rnd.nextInt(-seed, 0), },
    };

    public static void main(String[] args) {
        for (int i = 0; i < arrayRows; ++i) {
            for (int j = 0; j < arrayColumns; ++j) {
                arrayOfNumbers[i][j] = rnd.nextInt(0, seed);
            }
        }

        System.out.println("Initial two dimensional array: ");
        printTwoDimensionalArray(arrayOfNumbers);
        displayThirdRow(arrayOfNumbers);
        addUpAndMultipyMatrixes(matrixC, matrixD);
        sumUpAllElements(matrixC);
        findAllNegativeIntegers(negativePositiveArray);

        System.out.println("negativePositiveArray sorted by ascending rows: ");
        for (int[] subArray : negativePositiveArray) {
            Arrays.sort(subArray);
            System.out.printf("%s\n", Arrays.toString(subArray));
        }
    }

    public static void printTwoDimensionalArray(int[][] arrayToDisplay) {
        for (int row = 0; row < arrayToDisplay.length; ++row) {
            System.out.printf("%s\n", Arrays.toString(arrayToDisplay[row]));
        }
    }

    public static void displayThirdRow(int[][] arrayOfNumbersToDisplay) {
        int rowToDisplay = 3;
        System.out.print("Third row: [");
        for (int i = 0; i < arrayOfNumbersToDisplay[rowToDisplay - 1].length; ++i) {
            if (i == arrayOfNumbersToDisplay[rowToDisplay - 1].length - 1) {
                System.out.printf("%d", arrayOfNumbersToDisplay[rowToDisplay - 1][i]);
            } else {
                System.out.printf("%d, ", arrayOfNumbersToDisplay[rowToDisplay - 1][i]);
            }
        }
        System.out.println("]");
    }

    public static void addUpAndMultipyMatrixes(int[][] matrixC, int[][] matrixD) {
        try {
            int checkBounds = matrixC[0][2];
            checkBounds = matrixC[1][2];
            checkBounds = matrixC[2][2];
            checkBounds = matrixD[0][2];
            checkBounds = matrixD[1][2];
            checkBounds = matrixD[2][2];
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("Matrixes must be 3x3 size: %s\n", e.getMessage());
        }

        System.out.println("MatrixC: ");
        printTwoDimensionalArray(matrixC);
        System.out.println("MatrixD");
        printTwoDimensionalArray(matrixD);

        int[][] sumMatrix = new int[matrixC.length][matrixC[0].length];
        System.out.println("sumMatrix: ");
        for (int i = 0; i < matrixC.length; ++i) {
            for (int j = 0; j < matrixC[i].length; ++j) {
                sumMatrix[i][j] = (matrixC[i][j] + matrixD[i][j]);
            }
            System.out.printf("%s\n", Arrays.toString(sumMatrix[i]));
        }

        int[][] multiplyMatrix = new int[matrixC.length][matrixC[0].length];
        System.out.println("multiplyMatrix: ");
        for (int i = 0; i < matrixC.length; ++i) {
            for (int j = 0; j < matrixC[i].length; ++j) {
                multiplyMatrix[i][j] = (matrixC[i][j] * matrixD[i][j]);
            }
            System.out.printf("%s\n", Arrays.toString(multiplyMatrix[i]));
        }
    }

    public static void sumUpAllElements(int[][] arrayToSumUp) {
        int sum = 0;
        for (int[] subArray : arrayToSumUp) {
            for (int number : subArray) {
                sum += number;
            }
        }
        System.out.println("arrayToSumUp: ");
        printTwoDimensionalArray(arrayToSumUp);

        System.out.printf("Sum of arrayToSumUp: %d\n", sum);
    }

    public static void findAllNegativeIntegers(int[][] arrayOfNumbers) {
        System.out.println("negativePositiveArray: ");
        printTwoDimensionalArray(arrayOfNumbers);
        ArrayList<int[]> indexes = new ArrayList<>();
        for (int i = 0; i < arrayOfNumbers.length; ++i) {
            for (int j = 0; j < arrayOfNumbers[i].length; ++j) {
                if (arrayOfNumbers[i][j] < 0) {
                    indexes.add(new int[]{i, j});
                }
            }
        }
        System.out.println("Indexes with negative numbers");
        for (int[] index : indexes) {
            System.out.printf("%s, ", Arrays.toString(index));
        }
        System.out.println();
    }
}
