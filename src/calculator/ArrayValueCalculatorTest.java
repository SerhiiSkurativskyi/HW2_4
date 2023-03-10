package calculator;

import org.junit.Assert;
import org.junit.Test;

import static calculator.ArrayValueCalculator.doCalc;

public class ArrayValueCalculatorTest {
    @Test(expected = ArraySizeException.class)
    public void doCalcWithInvalidArraySizeTest() {
        String[][] arrayInvalidSize = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"}
        };
        doCalc(arrayInvalidSize);
    }

    @Test(expected = ArrayDataException.class)
    public void doCalcWithInvalidDataTest() {
        String[][] arrayInvalidData = {
                {"one", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        doCalc(arrayInvalidData);
    }

    @Test
    public void doCalcTest() {
        String[][] arrayCorrect = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        Assert.assertEquals(136, doCalc(arrayCorrect));

    }
}
