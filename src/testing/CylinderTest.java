package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Cylinder;

public class CylinderTest {

    @Test
    public void testCalcVolume() {
        Cylinder cylinder = new Cylinder(5.0, 2.0);
        double expected = 62.83185307179586;
        double actual = cylinder.calcVolume();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcBaseArea() {
        Cylinder cylinder = new Cylinder(5.0, 2.0);
        double expected = 12.566370614359172;
        double actual = cylinder.calcBaseArea();
        assertEquals(expected, actual, 0.0);
    }
}
