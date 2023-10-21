package lib;

import java.io.*;

public class FileInput {
    private BufferedReader in;

    public FileInput(String fileName) throws FileNotFoundException {
        FileReader fr = new FileReader(new File(fileName));
        in = new BufferedReader(fr);
    }

    public String readLine() throws IOException {
        return in.readLine();
    }

    public void close() throws IOException {
        in.close();
    }
}
