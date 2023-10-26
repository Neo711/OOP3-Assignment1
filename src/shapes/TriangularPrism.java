package shapes;

public class TriangularPrism extends Prism {

    public TriangularPrism(double height, double side) {
        super(height, side);
    }

    public TriangularPrism() {
        super();
    }

    @Override
    public double calcVolume() {
        double baseArea = this.calcBaseArea();
        double volume = baseArea * this.getHeight();
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = Math.pow(this.getSide(), 2) / 2;
        return baseArea;
    }
}
