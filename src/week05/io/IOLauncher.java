package week05.io;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class IOLauncher {
    public static void main(String[] args) {
        File dir = new File("files");

        if(!dir.exists()){
            dir.mkdir();
        }

        File output = new File("files/test.txt");



        try(FileOutputStream fos = new FileOutputStream(output, true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            PrintWriter pw = new PrintWriter(bos)) {

            pw.println("Hallo, wereld!!!!");

        } catch (IOException e) {

            e.printStackTrace();
        }


        // DING DOEN!!!!
        try {
            Scanner scanner = new Scanner(output);

            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
