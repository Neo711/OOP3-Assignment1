package shapes;

public class TriangularPrism extends Prism {

    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = baseArea * this.height;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.pow(this.side, 2) / 2;
        return baseArea;
    }
}
