package shapes;

/*
 * Making this class abstract means that it cannot be instantiated. This is
 * allows us to make our code reusable, maintainable, and scalable!
 * 
 * This class will be the parent class for all of our prisms. It will contain
 * the height and sideLength attributes, which are common to all prisms.
 * 
 * This class extends the Shape class, which means that it inherits the height
 * attribute and the addShape() method.
 * 
 * This class implements the Comparable and Comparator interfaces. This means
 * that any class that extends this class will have to implement the
 * compareTo() and compare() methods.
 * 
 * We will use the compareTo() method to compare two prisms by their height.
 * We will use the compare() method to compare two prisms by their base area and volume.
 */
public abstract class Prism extends Shape {
    double value1;
    double value2;

    /*
     * This constructor will be called by the constructors of the classes that
     * extend this class. It will set the height and sideLength attributes to the
     * values passed in as arguments.The constructor also calls the constructor of
     * the Shape class, which adds the shape to the shapesArray array.
     */
    public Prism(double value1, double value2) {
        super(value1);
        this.value2 = value2;
    }
}
