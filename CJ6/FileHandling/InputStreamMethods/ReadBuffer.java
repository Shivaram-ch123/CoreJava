package FileHandling.InputStreamMethods;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBuffer {
    public static void main(String[] args) throws IOException {
        java.io.InputStream fs = new FileInputStream("File.txt");

        byte arr[]=new byte[2];
        int count = fs.read(arr);
        System.out.println("no of bytes read : "+count);
        System.out.println("string that has read til now : "+new String(arr));

    }
}
