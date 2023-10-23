package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.PentagonalPrism;

public class PentagonalPrismTest {
    @Test
    public void testCalcVolume() {
        PentagonalPrism pentagonalPrism = new PentagonalPrism(10, 5);
        double expected = 430.11935014724173;
        double actual = pentagonalPrism.calcVolume();
        assertEquals(expected, actual, 0.00000000000001);
    }

    @Test
    public void testCalcBaseArea() {
        PentagonalPrism pentagonalPrism = new PentagonalPrism(10, 5);
        double expected = 43.01193501472417;
        double actual = pentagonalPrism.calcBaseArea();
        assertEquals(expected, actual, 0.00000000000001);
    }
}
