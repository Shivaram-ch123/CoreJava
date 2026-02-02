package FileHandling.OutPutStreamMethods;

import java.io.*;

public class Flush {
    public static void main(String[] args) throws IOException {
        //4. flush()
        //Purpose: Forces any buffered output to actually be written.
        //Some streams store data in a buffer for efficiency; flush() makes sure it’s all sent.
        OutputStream os = new FileOutputStream("File.txt");
        os.write(75); // write 'K'
        os.flush();   // ensures 'K' is actually written to the file

        //5. close
        os.close();
    }
}
