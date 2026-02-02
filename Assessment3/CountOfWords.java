import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class CountOfWords {
    public static void main(String[] args) throws IOException {
        InputStream ip=new FileInputStream("example1.txt");
        int data =ip.read();
        int cnt=0;
        while(data!=-1){
            if(data==32)cnt++;
            data= ip.read();
        }
        System.out.println("Ans = "+(cnt+1));
    }
}
