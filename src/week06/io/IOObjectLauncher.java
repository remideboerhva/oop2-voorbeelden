package week06.io;

import week06.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOObjectLauncher {

    public static final String DATA_OBJ = "data.obj";

    public static void main(String[] args) {

        // schrijven
        try(FileOutputStream fos = new FileOutputStream(DATA_OBJ); ObjectOutputStream oos = new ObjectOutputStream(fos)){
            User user1 = new User(1, "Jaap");
            User user2 = new User(2, "Karel");

            oos.writeInt(2); // file format bepalen
            oos.writeObject(user1);
            oos.writeObject(user2);

            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // lezen
        try(FileInputStream fis = new FileInputStream(DATA_OBJ); ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<User> list = new ArrayList<>();
            int nrUsers = ois.readInt();

            for (int i = 0; i < nrUsers; i++) {
                User user = (User) ois.readObject();// leest user, moet we bestaan
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

