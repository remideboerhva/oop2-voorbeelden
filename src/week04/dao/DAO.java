package week04.dao;

import java.util.List;

public interface DAO<T> {
    List<T> getAll();

    T get(int id);

    void addOrUpdate(T model);

    void remove(T model);

    void save(T model);
}
