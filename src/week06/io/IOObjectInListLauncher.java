package week06.io;

import week06.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOObjectInListLauncher {

    public static final String DATA_OBJ = "files/data-list.obj";

    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        list.add(new User(1, "Jaap"));
        list.add(new User(15, "Karel"));
        list.add(new User(9, "Marie"));
        list.add(new User(301, "Janet"));


        // schrijven
        try(FileOutputStream fos = new FileOutputStream(DATA_OBJ); ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeInt(list.size()); // file format bepalen
            for(User user: list){
                oos.writeObject(user);
            }

            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lezen
        try(FileInputStream fis = new FileInputStream(DATA_OBJ); ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<User> listFromFile = new ArrayList<>();
            int nrUsers = ois.readInt();

            System.out.println("Aantal users in file: " + nrUsers);

            for (int i = 0; i < nrUsers; i++) {
                User user = (User) ois.readObject(); // Kan ClassCastException gooien als het niet het juiste type is
                listFromFile.add(user);
            }

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
