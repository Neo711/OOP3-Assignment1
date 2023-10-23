package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Cone;

public class ConeTest {
    @Test
    public void testCalcVolume() {
        Cone cone = new Cone(5.0, 2.0);
        double expected = 20.943951023931955;
        double actual = cone.calcVolume();
        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalcBaseArea() {
        Cone cone = new Cone(5.0, 2.0);
        double expected = 12.566370614359172;
        double actual = cone.calcBaseArea();
        assertEquals(expected, actual, 0.0);
    }
}
