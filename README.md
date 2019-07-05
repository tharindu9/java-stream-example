# java-stream-example


Smaple FileRead

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args)  throws IOException {

        FileReader fr = new FileReader("/home/user/Desktop/fileTest.txt");

        BufferedReader br  = new BufferedReader(fr);

        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }

        br.close();
    }
}
