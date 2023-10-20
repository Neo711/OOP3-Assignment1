package shapes;

public abstract class Shape {
    double height;

    public Shape(double height) {
        this.height = height;
    }

    public abstract double calcVolume();

    public abstract double calcBaseArea();
}
