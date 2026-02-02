package FileHandling.ByteStream;

import java.io.IOException;

public class ByteArrayOutputStream {

    public static void main(String[] args) throws IOException {
        //Constructors :
        //ByteArrayOutputStream() : creates a new ByteArrayOutputStream to write bytes
        //ByteArrayOutputStream(int buffersize) : creates a new ByteArrayOutputStream with buffersize to write bytes.

        byte data[]={12,54,47};
        java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
        bos.write(data);

        System.out.println(bos.toString());
    }
}
