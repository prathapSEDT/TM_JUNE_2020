package Folders;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String path="D:\\Results";

        File f=new File(path,"abc.txt");

        FileWriter fileWriter=new FileWriter(f);

        PrintWriter printWriter=new PrintWriter(fileWriter);

        printWriter.println("Hello doing test on buffered writter");
        printWriter.println(65);
        printWriter.flush();
        printWriter.close();
        fileWriter.close();





    }
}
