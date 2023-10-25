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
        double volume = baseArea * this.height;
        return volume;
    }

    @Override
    public double calcBaseArea() {
        double baseArea = this.side * this.side;
        return baseArea;
    }
}
