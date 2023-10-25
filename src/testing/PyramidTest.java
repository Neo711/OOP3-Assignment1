package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Pyramid;

public class PyramidTest {
    @Test
    public void testCalcVolume() {
        Pyramid pyramid = new Pyramid(10, 5);
        double volume = pyramid.calcVolume();
        assertEquals(83.33333333333333, volume, 0.00000000000001);
    }

    @Test
    public void testCalcBaseArea() {
        Pyramid pyramid = new Pyramid(10, 5);
        double baseArea = pyramid.calcBaseArea();
        assertEquals(25, baseArea, 0.00000000000001);
    }
}
