package week06;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }
}