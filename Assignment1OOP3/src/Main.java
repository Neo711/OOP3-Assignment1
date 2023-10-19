import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Sample shapes for demonstration purposes:
        List<ThreeDShape> shapes = Arrays.asList(
            // TODO: You can add some actual ThreeDShape objects here for testing.
        );

        Comparator<ThreeDShape> comparator = null;

        for (int i = 0; i < args.length; i++) {
            if ("-t".equals(args[i]) && i + 1 < args.length) {
                String type = args[i + 1];
                switch (type) {
                    case "h":
                        Collections.sort(shapes); // Use the default compareTo method for height
                        break;
                    case "v":
                        comparator = new VolumeComparator();
                        Collections.sort(shapes, comparator);
                        break;
                    case "a":
                        comparator = new BaseAreaComparator();
                        Collections.sort(shapes, comparator);
                        break;
                    default:
                        System.out.println("Invalid type argument. Use 'h' for height, 'v' for volume, and 'a' for base area.");
                        return;
                }
            }
        }
        // Print sorted shapes for demonstration
        for (ThreeDShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
