package shapes;

public class Cone extends Shape {
    public double radius;

    public Cone(double height, double radius) {
        super(height);
        this.radius = radius;
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = (1 / 3) * baseArea * this.height;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.PI * Math.pow(this.radius, 2);
        return baseArea;
    }
}
