package FileHandling.ByteStream;

import java.io.*;
public class FileOutputStream {
    public static void main(String[] args)  {
        //Constructors :
        //FileOutputStream(String name) – Opens (or creates) a file with the given name for writing.
        //
        //FileOutputStream(File file) – Opens (or creates) the given File object for writing, overwriting existing content.
        //
        //FileOutputStream(File file, boolean append) – Opens the File object and appends data if true, otherwise overwrites.
        //
        //FileOutputStream(String name, boolean append) – Opens (or creates) the file by name and appends if true.
        //
        //FileOutputStream(FileDescriptor fdobj) – Writes to an already-open file represented by a FileDescriptor.




        //Methods :

        //void close()	 It closes the file output stream.
        //protected void finalize()	It is used to clean up all the connection with the file output stream and finalize the data.
        //FileChannel getChannel() 	Returns the unique FileChannel object associated with this file output stream.
        //FileDescriptor getFD() 	It returns the file descriptor associated with the stream.
        //void write()
        //
        //It writes the single byte to the file output stream.
        //
        //void write(int b)	It is used to write the specified byte to the file output stream.
        //void write(byte[] arr)	It is used to write data in bytes of arr[] to file output stream.
        //void write(byte[] ary, int off, int len)	It is used to write the number of bytes equal to length to the output stream from an array starting from the position start.


        String data = "Hello, World!";

        try (java.io.FileOutputStream fos = new java.io.FileOutputStream("output1.txt")) {

            // Converting the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writing the bytes to the file
            fos.write(dataBytes);

            System.out.println("Data successfully written to the file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
