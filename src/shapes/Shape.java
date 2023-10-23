package shapes;

import java.util.Comparator;

/*
 * Making this class abstract means that it cannot be instantiated. This is
 * allows us to make our code reusable, maintainable, and scalable!
 * 
 * This class will be the parent class for all of our shapes. It will contain
 * the height attribute, which is common to all shapes.
 * This class will also contain the static shapesArray array, which will be an
 * array that contains all of the shapes that we create. This array will be 
 * reset every time we run the program.
 * 
 * This class implements the Comparable and Comparator interfaces. This means
 * that any class that extends this class will have to implement the
 * compareTo() and compare() methods.
 * 
 * We will use the compareTo() method to compare two shapes by their height.
 * We will use the compare() method to compare two shapes by their base area and volume.
 */
public abstract class Shape implements Comparable<Shape>, Comparator<Shape> {
    public static Shape[] shapesArray = {};
    public double value1;
    public static String compareType;

    /*
     * This constructor will be called by the constructors of the classes that
     * extend this class. It will set the height attribute to the value passed
     * in as an argument, and it will add the shape to the shapesArray array.
     */
    public Shape(double value1) {
        this.value1 = value1;
        this.addShape();
    }

    /*
     * The addShape() method will add the shape to the shapesArray array.
     * It will create a new array that is one element larger than the
     * shapesArray array, and it will copy all of the elements from the
     * shapesArray array into the new array. Then, it will add the shape
     * to the last index of the new array, and it will set the shapesArray
     * array to the new array.
     */
    public void addShape() {
        Shape[] temp = new Shape[shapesArray.length + 1];
        for (int i = 0; i < shapesArray.length; i++) {
            temp[i] = shapesArray[i];
        }
        temp[temp.length - 1] = this;
        shapesArray = temp;
    }

    /*
     * The setCompareType() method will set the compareType attribute to the
     * value passed in as an argument.
     */
    public static void setCompareType(String compareType) {
        Shape.compareType = compareType;
    }

    /*
     * The calcVolume() method will be implemented by the classes that extend
     * this class. It will calculate the volume of the shape.
     */
    public abstract double calcVolume();

    /*
     * The calcBaseArea() method will be implemented by the classes that extend
     * this class. It will calculate the base area of the shape.
     */
    public abstract double calcBaseArea();

    @Override
    public int compareTo(Shape s1) {
        if (this.value1 > s1.value1) {
            return 1;
        } else if (this.value1 < s1.value1) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Shape s1, Shape s2) {
        if (compareType == "volume") {
            if (s1.calcVolume() > s2.calcVolume()) {
                return 1;
            } else if (s1.calcVolume() < s2.calcVolume()) {
                return -1;
            } else {
                return 0;
            }
        } else if (compareType == "base area") {
            if (s1.calcBaseArea() > s2.calcBaseArea()) {
                return 1;
            } else if (s1.calcBaseArea() < s2.calcBaseArea()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
