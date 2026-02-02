package FileHandling.OutPutStreamMethods;
import java.io.*;
public class WriteBuffer {
    public static void main(String[] args)throws IOException {
        //2. write(byte[] b)
        //Purpose: Writes all bytes from a byte array to the output stream.

        OutputStream os = new FileOutputStream("File.txt");
        byte[] data = {67, 68, 69}; // C, D, E
        os.write(data);
        os.close();


    }
}
