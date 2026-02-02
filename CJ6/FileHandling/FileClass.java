package FileHandling;
import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        String filename = "File.txt";
        File file=new File(filename);
        System.out.println("File name :" + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path:" + file.getAbsolutePath());
        System.out.println("Parent:" + file.getParent());
        System.out.println("Exists :" + file.exists());

        // you can also take the file path and file name from the user and :
        // File f = new File(dirpath, dname) :use this constructor so that
        // it combines both and make the file path :
        // fullPath = dirpath + File.separator + dname


        //1. ; — it separates multiple paths in a list.   (File.pathSeparatorChar)
        System.out.println("Path separator character: " + File.pathSeparatorChar);

        // Example: building multiple paths
        String paths = "C:" + File.separator + "Folder1"
                + File.pathSeparatorChar
                + "C:" + File.separator + "Folder2";

        System.out.println("Multiple paths: " + paths);

        //2. file separator
        String folder = "Documents";
        String fileName = "myfile.txt";
        String path = "C:" + File.separator + folder + File.separator + fileName;
        File f = new File(path);

        //what i have understood is : File file=new File("..........") it is just creating a obj and checking if that
        // file exists or not , ? and if exist we can do some operatioons , but we cannot do change the things and manipulate
        // the content . if we have access to chaneg we can change - yes / no , in one line


    }
}
