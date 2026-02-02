package FileHandling.FileClas;

import java.io.*;

public class FileClassImplementation {
    public static void main(String[] args) {
        //The File class is used to work with files and folders in Java.
        //It does not read or write data inside the file — it just works with the file itself
        // (like checking if it exists, creating it, deleting it, or getting info about it).

        File myFile = new File("output.txt"); // create a File object
        System.out.println("Parent folder: " + myFile.getParent()); // get parent folder
        System.out.println("Exists? " + myFile.exists()); // check if file exists
    }
}
