package shapes;

public abstract class Prism {
    double height;
    double sideLength;

    public Prism(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    public abstract double calcVolume();

    public abstract double calcBaseArea();
}
