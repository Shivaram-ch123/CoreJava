package FileHandling.ByteStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {
    public static void main(String[] args) throws IOException {
        //1. FileInputStream(String name)   --> checks if the file exist or not
        //Creates reference to the corresponding file with the given name ,

        //If "example.txt" exists, the FileInputStream opens it for reading.
        //If "example.txt" does not exist, Java throws a FileNotFoundException.

        //FileInputStream fi = new FileInputStream("example.txt");

        //2. FileInputStream(File file)
        //Creates an input file stream to read from the specified File object.
        //

        //
        //3. FileInputStream(FileDescriptor fdobj)
        //Creates an input file stream to read from the specified file descriptor.
        //
        //FileDescripstor fd = FileDecriptor.in;
        //FileInputStream fi = new FileInputStream(fd);


        //Methods :
        //available()	Returns an estimate of the number of remaining bytes that can be read (or skipped over) from this input stream.
        //close()	Closes this file input stream and releases any system resources associated with the stream.
        //finalize()	Ensures that the close method of this file input stream is called when there are no more references to it.
        //getChannel()	Returns the unique FileChannel object associated with this file input stream.
        //getFD()	Returns the FileDescriptor object that represents the connection to the actual file in the file system being used by this FileInputStream.
        //read()	Reads a byte of data from this input stream
        //read(byte[] b)	Reads up to b.length bytes of data from this input stream into an array of bytes.
        //read(byte[] b, int off, int len)	Reads up to len bytes of data from this input stream into an array of bytes.
        //skip()	Skips over and discards n bytes of data from the input stream


        File f = new File("example1.txt");
        java.io.InputStream fi = new java.io.FileInputStream(f);
        System.out.println((char)fi.read());
    }
}
