package shapes;

public class Cylinder extends Prism {
    public double height;
    public double radius;

    public Cylinder(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = baseArea * this.height;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        return baseArea;
    }
}
