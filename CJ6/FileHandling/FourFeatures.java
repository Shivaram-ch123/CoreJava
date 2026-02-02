package FileHandling;

import java.io.File;

public class FourFeatures {
    public static void main(String[] args) {
        //1. (File.separator)
        String path = "C:" + File.separator + "Users" + File.separator + "Me" + File.separator + "Documents";
        System.out.println(path);
        File file =new File(path);
        //Think of a street address:
        //Street > House > Room

        //2. separatorChar
        char sep = File.separatorChar;
        String path1 = "C:" + sep + "Users" + sep + "Me" + sep + "Documents";
        System.out.println(path1);


        //2. pathSeperator multiple paths
        String paths = "C:\\Windows" + File.pathSeparator + "C:\\Program Files" + File.pathSeparator + "C:\\Users\\Me";
        System.out.println(paths);

        //3.
        char pSep = File.pathSeparatorChar;
        String paths1 = "C:\\Windows" + pSep + "C:\\Program Files" + pSep + "C:\\Users\\Me";
        System.out.println(paths1);





    }
}
