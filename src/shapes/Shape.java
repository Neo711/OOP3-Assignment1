package shapes;

/*
 * Making this class abstract means that it cannot be instantiated. This is
 * allows us to make our code reusable, maintainable, and scalable!
 *  
 */

public abstract class Shape implements Comparable<Double> {
    public static Shape[] shapesArray = {};
    public double height;

    public Shape(double height) {
        this.height = height;
        this.addShape();
    }

    public void addShape() {
        Shape[] temp = new Shape[shapesArray.length + 1];
        for (int i = 0; i < shapesArray.length; i++) {
            temp[i] = shapesArray[i];
        }
        temp[temp.length - 1] = this;
        shapesArray = temp;
    }

    public abstract double calcVolume();

    public abstract double calcBaseArea();
}
