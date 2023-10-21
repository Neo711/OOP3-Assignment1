package lib;

import java.io.*;

public class FileOutput {
    private BufferedWriter out;

    public FileOutput(String fileName) throws IOException {
        FileWriter fw = new FileWriter(new File(fileName));
        out = new BufferedWriter(fw);
    }

    public void writeLine(String data) throws IOException {
        out.write(data);
        out.newLine();
    }

    public void close() throws IOException {
        out.close();
    }
}

