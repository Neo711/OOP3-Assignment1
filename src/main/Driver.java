package main;

import java.io.IOException;

public class Driver {

    public static void main(String[] args) {
        String filePath = null;

        // Parse command line arguments
        for (int i = 0; i < args.length - 1; i++) {
            if ("-f".equals(args[i])) {
                filePath = args[i + 1];
                break;
            }
        }

        if (filePath == null) {
            System.out.println("Please specify a file using the -f option.");
            return;
        }

        // Assuming a maximum of 100 shapes for simplicity
        String[] shapes = new String[100];
        int shapeCount = 0;

        // Use FileInput class to read from file
        try (FileInput fileInput = new FileInput(filePath)) {
            String shape;
            while ((shape = fileInput.readLine()) != null && shapeCount < 100) {
                shapes[shapeCount++] = shape;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }

        // Use FileOutput class to write to an output file
        try (FileOutput fileOutput = new FileOutput("output.txt")) {
            for (int i = 0; i < shapeCount; i++) {
                fileOutput.writeLine(shapes[i]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        System.out.println("Shapes processed and written to output.txt!");
    }
}

