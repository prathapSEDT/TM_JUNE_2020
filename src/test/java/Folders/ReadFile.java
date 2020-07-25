package Folders;



import java.io.*;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        File f=new File("D:\\Results\\abc.txt");

        FileReader fr=new FileReader(f);

        BufferedReader bufferedReader=new BufferedReader(fr);

        String data=bufferedReader.readLine();
        while (data!=null) {
            System.out.println(data);
            data=bufferedReader.readLine();
        }

    }
}
