package shapes;

public class PentagonalPrism extends Prism {

    public PentagonalPrism(double height, double side) {
        super(height, side);
    }

    public PentagonalPrism() {
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
        double baseArea = Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(this.getSide(), 2) / 4;
        return baseArea;
    }
}
