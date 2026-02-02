package FileHandling.InputStreamMethods;

import java.io.*;

public class InputStream {
    public static void main(String[] args) throws IOException {
        String text = "Hello World";
        java.io.InputStream in = new ByteArrayInputStream(text.getBytes());

        if (in.markSupported()) {
            in.mark(5); // mark the current position
            System.out.print((char) in.read()); // H
            System.out.print((char) in.read()); // e
            in.reset(); // go back to the mark
            System.out.print((char) in.read()); // H again!
        }
    }
}
