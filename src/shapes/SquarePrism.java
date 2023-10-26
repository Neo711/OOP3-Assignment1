package shapes;

public class SquarePrism extends Prism {

    public SquarePrism(double height, double side) {
        super(height, side);
    }

    public SquarePrism() {
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
        double baseArea = this.getSide() * this.getSide();
        return baseArea;
    }
}
