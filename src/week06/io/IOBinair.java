package week06.io;

import java.io.*;
import java.util.Random;

public class IOBinair {

    public static final String FILES_BIN_DAT = "files/bin.dat";

    public static void main(String[] args) {

        // schrijven
        try(FileOutputStream fos = new FileOutputStream(FILES_BIN_DAT, true);
            DataOutputStream dos = new DataOutputStream(fos)) {

            Random rng = new Random();

            int x = rng.nextInt(101);
            int y = rng.nextInt(101);

            System.out.printf("Going to write: x[%d], y[%d]\n", x, y);

            dos.writeInt(x);
            dos.writeInt(y);

            dos.flush(); // wordt ook aangeroepen bij close

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        // lezen
        boolean isMore = true;

        try(FileInputStream fis = new FileInputStream(FILES_BIN_DAT);
            DataInputStream dis = new DataInputStream(fis)) {

            while (isMore) {
                System.out.printf("gelezen: %d\n", dis.readInt());
            }

        } catch (EOFException e){
            System.out.println("reached EOF");
            isMore = false; // not really needed
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
