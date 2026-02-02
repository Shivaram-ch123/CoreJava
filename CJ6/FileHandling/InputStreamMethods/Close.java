package FileHandling.InputStreamMethods;

import java.io.*;
public class Close {
    public static void main(String[] args) throws IOException {
        //public abstract class InputStream
        //   extends Object
        //      implements Closeable




        java.io.FileInputStream in = new FileInputStream("File.txt");
        System.out.println(in.read()); // read something

        in.close(); // release system resources



        //6. markSupported()
        //Purpose: Checks if the stream supports mark() and reset(). Not all streams do.

        //7. skip(long n)
        //Purpose: Skips over n bytes in the stream. Useful if you want to ignore some data.
        //Example:
        //InputStream in = new FileInputStream("file.txt");
        //in.skip(5); // skip first 5 bytes
        //System.out.println((char) in.read()); // reads 6th byte
        //in.close();
    }
}
