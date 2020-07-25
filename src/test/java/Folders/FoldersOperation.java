package Folders;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FoldersOperation {

    public static void main(String[] args) {
        String expFormat=".xlsx";

        File f=new File("D:\\Results");

        File[] arr=f.listFiles();

        for (File file:arr) {


            if (file.isDirectory()){
                System.out.println(file);
            }



        }




    }
}
