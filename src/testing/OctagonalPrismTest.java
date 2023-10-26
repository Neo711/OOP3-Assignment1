package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.PentagonalPrism;

public class OctagonalPrismTest {
    @Test
    public void testCalcVolume() {
        PentagonalPrism prism = new PentagonalPrism(10, 5);
        double volume = prism.calcVolume();
        assertEquals(430.11935014724173, volume, 0.0000000000001);
    }

    @Test
    public void testCalcBaseArea() {
        PentagonalPrism prism = new PentagonalPrism(10, 5);
        double baseArea = prism.calcBaseArea();
        assertEquals(43.01193501472417, baseArea, 0.0000000000001);
    }
}
