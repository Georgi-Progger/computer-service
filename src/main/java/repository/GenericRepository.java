package repository;

import java.util.List;

public interface GenericRepository<T, ID> {

    T getById(ID id);
    List<T> getAll();

    T saveNewEntity(T entity);

    void updateEntity(T entity);

    void deleteEntity(ID id);
}
