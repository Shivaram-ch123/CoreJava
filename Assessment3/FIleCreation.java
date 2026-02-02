import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FIleCreation {
    public static void main(String[] args) throws IOException {
        File file=new File("example1.txt");
        Writer writer=new FileWriter(file);


    }
}
