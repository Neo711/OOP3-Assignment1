package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.SquarePrism;

public class SquarePrismTest {
    @Test
    public void testCalcVolume() {
        SquarePrism squarePrism = new SquarePrism(10, 5);
        double expected = 250;
        double actual = squarePrism.calcVolume();
        assertEquals(expected, actual, 0.00000000000001);
    }

    @Test
    public void testCalcBaseArea() {
        SquarePrism squarePrism = new SquarePrism(10, 5);
        double baseArea = squarePrism.calcBaseArea();
        assertEquals(25, baseArea, 0.00000000000001);
    }
}
