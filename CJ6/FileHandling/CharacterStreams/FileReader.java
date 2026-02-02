package FileHandling.CharacterStreams;

public class FileReader {
    public static void main(String[] args)throws Throwable {
        //constructors
        //FileReader(String fileName) → Read from a file using its name.
        //FileReader(File file) → Read from a File object.
        //FileReader(FileDescriptor fdObj) → Read from a file descriptor (low-level file).

        java.io.FileReader fr=new java.io.FileReader("output.txt");
        char[] buffer = new char[10];
        int n = fr.read(buffer, 0, 5);
        System.out.println(new String(buffer, 0, n));
        //Method	Easy Way to Remember
        //read()	Get 1 char
        //read(char[], offset, length)	Get many chars into an array
        //ready()	Check if you can read now
        //getEncoding()	Check file’s character type
        //close()	Stop reading and free resources
    }
}
