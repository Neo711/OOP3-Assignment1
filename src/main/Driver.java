import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;


public class ShapeFileReader {

    public static void main(String[] args) throws Exception {
        List<Shape> shapes = readShapesFromFile("path_to_shapes.txt");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static List<Shape> readShapesFromFile(String filePath) throws Exception {
        // List<Shape> shapes = new ArrayList<>();//get rid
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int numShapes = Integer.parseInt(br.readLine().trim());
            for (int i = 0; i < numShapes; i++) {
                String shapeType = br.readLine().trim();
                Class<?> shapeClass = Class.forName(shapeType);

                Constructor<?> constructor = shapeClass.getDeclaredConstructor();
                constructor.setAccessible(true);
                Object shape = constructor.newInstance();

                Method method = shapeClass.getMethod(shapeType);
                
                // //if (shapeClass.equals(Circle.class)) {
                //     double radius = Double.parseDouble(br.readLine().trim());
                //     Constructor<?> constructor = shapeClass.getConstructor(double.class);
                //     Shape circle = (Shape) constructor.newInstance(radius);
                //     shapes.add(circle);
                // } else if (shapeClass.equals(Rectangle.class)) {
                //     String[] dimensions = br.readLine().split(" ");
                //     double width = Double.parseDouble(dimensions[0]);
                //     double height = Double.parseDouble(dimensions[1]);
                //     Constructor<?> constructor = shapeClass.getConstructor(double.class, double.class);
                //     Shape rectangle = (Shape) constructor.newInstance(width, height);
                //     shapes.add(rectangle);
                // } else {
                //     throw new IllegalArgumentException("Unknown shape: " + shapeType);
                // }
            }
        }
        return shapes;
    }
}

