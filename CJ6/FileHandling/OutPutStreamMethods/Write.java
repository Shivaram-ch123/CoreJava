package FileHandling.OutPutStreamMethods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class Write {
    public static void main(String[] args) throws IOException {
        //1. write(int b)
       //Purpose: Writes one byte to the output stream.
       //        This is abstract, so every subclass must implement it.


        OutputStream os = new FileOutputStream("File.txt");
        os.write(65); // writes 'A'

        os.close();



        //In the file, this will produce: AB (ASCII values 65=A, 66=B).
    }
}
