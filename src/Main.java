

import calculator.ArrayDataException;
import calculator.ArraySizeException;

import static calculator.ArrayValueCalculator.doCalc;

public class Main {
    public static void main(String[] args) {

        String[][] arrayCorrect = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = doCalc(arrayCorrect);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid array data: " + e.getMessage());
        }
        String[][] arrayInvalidData = {
                {"one", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        try {
            int result = doCalc(arrayInvalidData);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid array data: " + e.getMessage());
        }
        String[][] arrayWrongSize1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"17", "18", "19", "20",}
        };
        try {
            int result = doCalc(arrayWrongSize1);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid array data: " + e.getMessage());
        }
        String[][] arrayWrongSize2 = {
                {"1", "2", "3", "4", "4"},
                {"5", "6", "7", "8", "8"},
                {"9", "10", "11", "12", "12"},
                {"13", "14", "15", "16", "16"}
        };
        try {
            int result = doCalc(arrayWrongSize2);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid array data: " + e.getMessage());
        }
        String[][] arrayWrongSize3 = {
                {"1", "2", "3", "4", "4"},
                {"5", "6", "7", "8", "8"},
                {"9", "10", "11", "12", "12"},
                {"9", "10", "11", "12", "12"},
                {"13", "14", "15", "16", "16"}
        };
        try {
            int result = doCalc(arrayWrongSize3);
            System.out.println("Sum of array values: " + result);
        } catch (ArraySizeException e) {
            System.out.println("Invalid array size: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Invalid array data: " + e.getMessage());
        }
        System.out.println("Finish");
    }
}