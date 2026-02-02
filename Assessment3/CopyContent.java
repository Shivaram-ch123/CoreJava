import java.io.*;

public class CopyContent {
    public static void main(String[] args) throws IOException {
        OutputStream o=new FileOutputStream("example2.txt");

        InputStream ip=new FileInputStream("example1.txt");

        int data=ip.read();
        while(data!=-1)
        {
            System.out.println(data);
            o.write(data);
            data=ip.read();
        }

    }
}
