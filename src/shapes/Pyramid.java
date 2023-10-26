package shapes;

public class Pyramid extends Shape {
    private double side;

    public Pyramid(double height, double side) {
        super(height);
        this.side = side;
    }

    public Pyramid() {
        super();
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = baseArea * this.getHeight() / 3;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.pow(this.side, 2);
        return baseArea;
    }
}
