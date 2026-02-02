package FileHandling.ByteStream;

public class ByteArrayInputStream {
    public static void main(String[] args) {
        //ByteArrayInputStream reads data from a byte array stored in memory.


        //constructor:
        //First constructor: Read the whole notebook. ByteArrayInputStream(byte[] buffer)
        //Second constructor: Read only a few pages starting from page X.  ByteArrayInputStream(byte[] buf, int offset, int length)




        byte[] data = {10, 20, 30, 40, 50}; // a byte array with 5 numbers

        // create ByteArrayInputStream to read all bytes
        java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(data);

        int value;
        while ((value = bis.read()) != -1) {  // read until end
            System.out.println(value);
        }


        //methods :
        //available()	It tells the total number of bytes from the input stream to be read.
        //close()	It closes the input stream and releases system resources.
        //mark()	It marks the current position of the input stream which means setting the read limit.
        //markSupported()	It tests if this input stream supports the mark and reset method.
        //read()	It reads the next byte of data from the input stream.
        //reset()	It repositions the input stream to the marked position and is called the mark() method
        //skip()	Skips the "args" in the input stream.
    }
}
