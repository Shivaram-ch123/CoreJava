import java.io.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        Reader inputStream=new FileReader("example1.txt");
        BufferedReader br=new BufferedReader(inputStream);

        int data=br.read();
        while(data!=-1){
            System.out.print((char)data);
            data=br.read();
        }
    }
}
