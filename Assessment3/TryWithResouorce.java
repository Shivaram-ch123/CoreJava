import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResouorce {
    public static void main(String[] args) throws FileNotFoundException {
        try(InputStream inputStream=new FileInputStream("example1.txt")){
            System.out.println("Hello all");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("we run this always");
        }
    }
}
// it will auto=maticaly closes the resources