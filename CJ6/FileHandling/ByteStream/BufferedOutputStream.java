package FileHandling.ByteStream;

import java.io.IOException;


public class BufferedOutputStream {
    public static void main(String[] args) {
        //Constructors :
        //BufferedOutputStream(OutputStream out): Creates a buffered output stream with a default buffer size of 8192 bytes.
        //BufferedOutputStream(OutputStream out, int size): Creates a buffered output stream with the specified buffer size.

        //Method	Description
        //void write(int b)	Writes a single byte to the output stream.
        //void write(byte[] b, int off, int len)	Writes a portion of the byte array to the output stream.
        //void flush()	Flushes the buffer and forces any buffered output bytes to be written.
        //void close()	Closes the stream, flushing it first.



        try (java.io.FileOutputStream fos = new java.io.FileOutputStream("output564.txt");
             java.io.BufferedOutputStream bos = new java.io.BufferedOutputStream(fos,5)) {

            // Convert string to bytes and write to buffered output stream
            String data="hello all";
            bos.write(data.getBytes());

            // Important: flush the buffer to ensure all data is written to file
            bos.flush();

            System.out.println("Data written successfully to output.txt");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
