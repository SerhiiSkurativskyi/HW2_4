package calculator;

public class ArrayValueCalculator {

    public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array.length != 4 || array[0].length != 4) {
                throw new ArraySizeException("Array size should be 4x4");
            }
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell [" + i + "][" + j + "]: " + array[i][j], e);
                }
            }
        }
        return sum;
    }
}
