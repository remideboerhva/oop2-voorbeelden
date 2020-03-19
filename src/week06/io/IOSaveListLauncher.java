package week06.io;

import week06.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOSaveListLauncher {

    public static final String DATA_OBJ = "files/data-list-only.obj";

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "Jaap"));
        list.add(new User(15, "Karel"));
        list.add(new User(9, "Marie"));
        list.add(new User(301, "Janet"));

        // schrijven
        try(FileOutputStream fos = new FileOutputStream(DATA_OBJ); ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(list); // file format bepalen
            oos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lezen
        try(FileInputStream fis = new FileInputStream(DATA_OBJ); ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<User> listFromFile = null;

            listFromFile = (List<User>) ois.readObject(); // Kan ClassCastException gooien als het niet het juiste type is

            System.out.println(listFromFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
