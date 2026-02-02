package FileHandling.InputStreamMethods;


import java.io.*;

public class Read {
    public static void main(String[] args) throws IOException {
        java.io.InputStream fs = new FileInputStream("File.txt");
        int data =fs.read();
        while(data!=-1){
            System.out.println((char) data);
            data=fs.read();
        }
        //Reads byte by byte until the end of the file.

    }
}
