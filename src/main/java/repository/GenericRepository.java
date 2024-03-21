package repository;

import java.util.List;

public interface GenericRepository<T, ID> {

    T getById(ID id);
    List<T> getAll();

    T saveNewEntity(T entity);
}