package FileHandling.OutPutStreamMethods;

import java.io.*;
public class WriteBufferExtra{
    public static void main(String[] args) throws Throwable {
        //3. write(byte[] b, int off, int len)
        //Purpose: Writes len bytes from the byte array starting at offset off.

        OutputStream os = new FileOutputStream("File.txt");
        byte[] data = {70, 71, 72, 73, 74}; // F G H I J
        os.write(data, 1, 3); // write 3 bytes starting from index 1

        os.close();
    }
}
