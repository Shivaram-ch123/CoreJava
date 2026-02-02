package FileHandling;

import java.io.*;

public class Normal {
    public static void main(String[] args) throws IOException {
        File f1 = new File("example1.txt");
        if (f1.createNewFile()) {
            System.out.println("File created Successfully with name: " + f1.getName());

        } else {
            System.out.println("File Existed Already with name: " + f1.getName());
        }
    }
}
