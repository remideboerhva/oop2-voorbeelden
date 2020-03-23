package week07.main.week05.data;

import java.util.List;

public interface DAO<T> {

    List<T> getAll();

    T get(int id);

    void addOrUpdate(T object);

    void remove(T object);

    boolean save();
    boolean load();

}
