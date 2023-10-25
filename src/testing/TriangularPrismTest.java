package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.TriangularPrism;

public class TriangularPrismTest {
    @Test
    public void testCalcVolume() {
        TriangularPrism triangularPrism = new TriangularPrism(10, 5);
        double expected = 125;
        double actual = triangularPrism.calcVolume();
        assertEquals(expected, actual, 0.00000000000001);
    }

    @Test
    public void testCalcBaseArea() {
        TriangularPrism triangularPrism = new TriangularPrism(10, 5);
        double expected = 12.5;
        double actual = triangularPrism.calcBaseArea();
        assertEquals(expected, actual, 0.00000000000001);
    }
}
