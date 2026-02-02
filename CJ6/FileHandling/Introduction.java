package FileHandling;

import java.io.IOException;

public class Introduction {
    public static void main(String[] args) throws IOException {
        //Java I/O helps programs read data from different sources and write data to different places easily and efficiently.

        /*
        1. Byte Streams :water flowing through a pipe. 0/1
            i.🔹 Input Stream
                Used to read data
                Data flows from a source into the program
                Example sources: keyboard, file

            ii.🔹 Output Stream
                Used to write data
                Data flows from the program to a destination
                Example destinations: screen, file

         2. character streams : Readers and Writers are used in Java to work with text (characters) instead of raw bytes.
            i.🔹 Readers
                Used to read character data
                Read data one character at a time
                Commonly used to read text from files or keyboard

            ii.🔹 Writers
                Used to write character data
                Write data as characters
                Commonly used to write text into files






        */

        //2nd topic : 3 types of inbuilt streams
        System.out.println(10);       //1st
        int temp = System.in.read();  //2nd
        char ch= (char) temp;
        System.err.println(10);       //3rd
    }
}
