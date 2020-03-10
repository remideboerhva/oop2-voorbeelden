package week05.io;

import java.io.*;

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

            int nrUsers = ois.readInt();

            System.out.println("Aantal users in file" + nrUsers);

            for (int i = 0; i < nrUsers; i++) {
                System.out.printf("gelezen: [%s] ", ois.readObject()); // leest user, moet we bestaan
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

class User implements Serializable{
    private int id;
    private String naam;

    public User(int id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                '}';
    }
}