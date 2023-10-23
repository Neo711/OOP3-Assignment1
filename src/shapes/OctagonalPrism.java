package shapes;

public class OctagonalPrism extends Prism {

    public OctagonalPrism(double height, double side) {
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
        double baseArea = 2 * (1 + Math.sqrt(2)) * Math.pow(this.side, 2);
        return baseArea;
    }
}
