package shapes;

public class Pyramid extends Shape {
    public double side;

    public Pyramid(double height, double side) {
        super(height);
        this.side = side;
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = (1 / 3) * baseArea * this.height;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.pow(this.side, 2);
        return baseArea;
    }
}
