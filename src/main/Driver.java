package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import shapes.Shape;

public class Driver {

    public static void main(String[] args) {
        String filePath = args[0].substring(2);
        String compareType = args[1].substring(2);
        String sortType = args[2].substring(2);

        try {
            Shape[] shapes = readShapesFromFile(filePath);
            setShapeCompareType(compareType);
            String sortTypeName = setSortMethod(sortType);
            Method sortMethod = Shape.class.getMethod(sortTypeName, Shape[].class);
            sortMethod.invoke(sortMethod, (Object) shapes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Shape[] readShapesFromFile(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int numShapes = Integer.parseInt(br.readLine().trim());
            Shape[] shapes = new Shape[numShapes];
            for (int i = 0; i < numShapes; i++) {
                String shapeType = br.readLine().trim();
                Class<?> shapeClass = Class.forName(shapeType);

                double param1 = Double.parseDouble(br.readLine().trim());
                double param2 = Double.parseDouble(br.readLine().trim());

                Constructor<?> constructor = shapeClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                Object shape = constructor.newInstance();

                Method initializeMethod = shapeClass.getMethod("initialize", double.class, double.class);
                initializeMethod.invoke(shape, param1, param2);

                if (shape instanceof Shape) {
                    shapes[i] = (Shape) shape;
                } else {
                    System.out.println("The class " + shapeType + " is not an instance of Shape. Skipping...");
                }
            }
            return shapes;
        }
    }

    public static void setShapeCompareType(String compareType) {
        if (compareType == "h") {
            Shape.compareType = "height";
        } else if (compareType == "v") {
            Shape.compareType = "volume";
        } else if (compareType == "a") {
            Shape.compareType = "base area";
        } else {
            System.out.println("Invalid compare type. Please enter 'h' or 'v'.");
        }
        ;
    }

    public static String setSortMethod(String sortType) {
        String sortMethod = "";
        if (sortType == "b") {
            return "bubbleSort";
        } else if (sortType == "s") {
            return "selectionSort";
        } else if (sortType == "i") {
            return "insertionSort";
        } else if (sortType == "m") {
            return "mergeSort";
        } else if (sortType == "q") {
            return "quickSort";
        } else if (sortType == "z") {
            return "radixSort";
        } else {
            System.out.println("Invalid sort type. Please enter 'b', 's', 'i', or 'm'.");
        }
        return sortMethod;
    }
}

// //if (shapeClass.equals(Circle.class)) {
// double radius = Double.parseDouble(br.readLine().trim());
// Constructor<?> constructor = shapeClass.getConstructor(double.class);
// Shape circle = (Shape) constructor.newInstance(radius);
// shapes.add(circle);
// } else if (shapeClass.equals(Rectangle.class)) {
// String[] dimensions = br.readLine().split(" ");
// double width = Double.parseDouble(dimensions[0]);
// double height = Double.parseDouble(dimensions[1]);
// Constructor<?> constructor = shapeClass.getConstructor(double.class,
// double.class);
// Shape rectangle = (Shape) constructor.newInstance(width, height);
// shapes.add(rectangle);
// } else {
// throw new IllegalArgumentException("Unknown shape: " + shapeType);
// }
