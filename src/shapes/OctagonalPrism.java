package shapes;

public class OctagonalPrism extends Prism {

    public OctagonalPrism(double height, double side) {
        super(height, side);
    }

    public OctagonalPrism() {
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
        double baseArea = (1 + Math.sqrt(2)) * Math.pow(this.getSide(), 2) * 2;
        return baseArea;
    }
}
