package main;

import java.io.BufferedReader;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;

import shapes.Shape;
import shapes.SquarePrism;
import shapes.TriangularPrism;
import shapes.Cone;
import shapes.Cylinder;
import shapes.OctagonalPrism;
import shapes.PentagonalPrism;
import shapes.Pyramid;
import utility.Sorting;

public class Driver {

    public static void main(String[] args) {
        String filePath = args[0].substring(2);
        String compareType = args[1].substring(2);
        String sortType = args[2].substring(2);

        try {
            Shape[] shapes = readShapesFromFile(filePath);
            System.out.println(compareType);
            System.out.println(sortType);
            setShapeCompareType(compareType);
            String sortTypeName = setSortMethod(sortType); 
            Method sortMethod = Sorting.class.getMethod(sortTypeName, Shape[].class);
            Shape[] vars = Arrays.copyOfRange(shapes, 1, shapes.length - 1);
            sortMethod.invoke(sortMethod, new Object[]{vars});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Shape[] readShapesFromFile(String filePath) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        	String bigString = br.readLine().trim();
        	String[] splitedStrings = bigString.split(" ");
        	
            int numShapes = Integer.parseInt(splitedStrings[0]);
            Shape[] shapes = new Shape[numShapes];
            
            int splitedStringsIndex = 1;
            for (int i = 0; i < numShapes; i++) {
            	String path = "shapes.";
            	String classPath = path.concat(splitedStrings[splitedStringsIndex]);
            	Class<?> shapeClass = Class.forName(classPath); 
            	splitedStringsIndex++;
            	double param1 = Double.parseDouble(splitedStrings[splitedStringsIndex]);
            	splitedStringsIndex++;
                double param2 = Double.parseDouble(splitedStrings[splitedStringsIndex]);
                
                Constructor<?> constructor = shapeClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                Object shape = constructor.newInstance();

                Method initializeMethod1 = null;
                Method initializeMethod2 = null;
                if (shape instanceof OctagonalPrism || shape instanceof PentagonalPrism || shape instanceof SquarePrism || shape instanceof TriangularPrism || shape instanceof Pyramid) {
                    initializeMethod1 = shapeClass.getMethod("setHeight", double.class);
                    initializeMethod2 = shapeClass.getMethod("setSide", double.class);
                } else if (shape instanceof Cylinder || shape instanceof Cone) {
                    initializeMethod1 = shapeClass.getMethod("setHeight", double.class);
                    initializeMethod2 = shapeClass.getMethod("setRadius", double.class);
                }

                initializeMethod1.invoke(shape, param1);
                initializeMethod2.invoke(shape, param2);
                splitedStringsIndex++;
                
                shapes[i] = (Shape) shape;
            }
            
            return shapes;
        }
    }

    public static void setShapeCompareType(String compareType) {
        if (compareType.equals("h")) {
            Shape.compareType = "height";
        } else if (compareType.equals("v")) {
            Shape.compareType = "volume";
        } else if (compareType.equals("a")) {
            Shape.compareType = "base area";
        } else {
            System.out.println("Invalid compare type. Please enter 'h' or 'v'.");
        }
        ;
    }

    public static String setSortMethod(String sortType) {
        String sortMethodString = "";
        if (sortType.equals("b")) {
            return "bubbleSort";
        } else if (sortType.equals("s")) {
            return "selectionSort";
        } else if (sortType.equals("i")) {
            return "insertionSort";
        } else if (sortType.equals("m")) {
            return "mergeSort";
        } else if (sortType.equals("q")) {
            return "quickSort";
        } else if (sortType.equals("z")) {
            return "radixSort";
        } else {
            System.out.println("Invalid sort type. Please enter 'b', 's', 'i', or 'm'.");
        }
        return sortMethodString;
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
