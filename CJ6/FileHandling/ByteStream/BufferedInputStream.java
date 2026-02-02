package FileHandling.ByteStream;

public class BufferedInputStream {
    public static void main(String[] args) throws Throwable {
        //BufferedInputStream(InputStream in)	Default (~8 KB)	Quick wrapping, don’t care about size
        //BufferedInputStream(InputStream in, int size)	Custom size	Optimize for large/small data or memory usage

        //Methods :
        //Method	Simple Meaning
        //available()	Bytes ready to read
        //close()	Close stream & free resources
        //mark()	Save current position
        //markSupported()	Can mark/reset?
        //read()	Read one byte
        //read(byte[], off, len)	Read many bytes
        //reset()	Go back to mark
        //skip(n)	Ignore n bytes



        java.io.FileInputStream fis = new java.io.FileInputStream("output.txt");
        java.io.BufferedInputStream bis = new java.io.BufferedInputStream(fis,5);
        System.out.println(bis);
    }
}
