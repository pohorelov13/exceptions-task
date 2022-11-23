package demo;

import demo.exceptions.ArrayDataException;
import demo.exceptions.ArraySizeException;

import java.util.Arrays;

public class Calculator {
    int doCalc(String[][] s) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        int[] position = {0, 0};
        if (s.length == 4 && s[0].length == 4) {
            try {
                for (int i = 0; i < s.length; i++) {
                    position[0] = i;
                    for (int j = 0; j < s[0].length; j++) {
                        position[1] = j;
                        sum += Integer.parseInt(s[i][j]);
                    }
                }
            } catch (NumberFormatException e) {
                throw new ArrayDataException("Conversion error on position " + Arrays.toString(position));
            }
        } else {
            throw new ArraySizeException(String.format("Error size. Your array is %dx%d",
                    s.length, s[0].length));
        }

        return sum;
    }
}
