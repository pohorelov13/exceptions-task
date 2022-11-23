package demo;

import demo.exceptions.ArrayDataException;
import demo.exceptions.ArraySizeException;

import java.util.Arrays;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] rightArray = {{"1", "3", "5", "17"}, {"2", "15", "13", "8"},
                {"2", "5", "3", "18"}, {"22", "5", "33", "28"}};
        String[][] wrongDataArray = {{"1", "3", "3", "17"}, {"2", "15", "13", "8"},
                {"2", "5", "3", "18"}, {"22", "5", "seven", "28"}};
        String[][] wrongSizeArray = {{"1", "3", "5", "17"}, {"2", "15", "13", "8"},
                {"2", "5", "3", "18"}};

        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.doCalc(rightArray));
            //System.out.println(calculator.doCalc(wrongDataArray));
            //System.out.println(calculator.doCalc(wrongSizeArray));
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println(e.getMessage());
            System.err.println(Arrays.toString(e.getStackTrace()));
        }
    }
}