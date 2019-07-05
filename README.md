# java-stream-example


File Reading Smaple 

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



File Writing Sample


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExz {

    public static void main(String[] args) throws IOException {

        String inp = "test text";

        FileWriter fw = new FileWriter("/home/user/Desktop/fileTest.txt");

        BufferedWriter bf = new BufferedWriter(fw);

        bf.write("abcde");

        bf.close();


    }
}

