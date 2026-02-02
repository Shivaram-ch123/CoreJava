package FileHandling.CharacterStreams;

import FileHandling.InputStreamMethods.InputStream;

import java.io.FileReader;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) {
        // public abstract class Reader implements Readable, Closeable


        //Methods :
        //Method	Simple Explanation
        //close()	Stop using the reader and free resources.
        //mark(int readAheadLimit)	Remember this spot in the text so you can come back later.
        //markSupported()	Checks if the reader can remember a spot (true/false).
        //read()	Read one character from the text. Returns -1 if at the end.
        //read(char[] cbuf)	Read many characters into an array.
        //read(char[] cbuf, int off, int len)	Read part of an array starting at off for len characters.
        //read(CharBuffer target)	Read characters into a CharBuffer object (like a container for characters).
        //reset()	Go back to the last marked spot in the text.
        //skip(long n)	Jump over n characters without reading them.
    }
}
