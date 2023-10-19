import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ThreeDShape> shapes = Arrays.asList(
        );

        Comparator<ThreeDShape> comparator = null;

        for (int i = 0; i < args.length; i++) {
            if ("-t".equals(args[i]) && i + 1 < args.length) {
                String type = args[i + 1];
                switch (type) {
                    case "h":
                        Collections.sort(shapes);
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
        for (ThreeDShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
