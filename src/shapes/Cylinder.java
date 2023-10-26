package shapes;

public class Cylinder extends Shape {
    private double radius;

    public Cylinder(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    public Cylinder() {
        super();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = baseArea * this.getHeight();
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        return baseArea;
    }

    public String toString() {
        return "Shape: Cylinder, Height: " + getHeight() + ", Radius: " + getRadius();
    }
}
