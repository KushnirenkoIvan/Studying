package ua.kushnirenko.rest.repository;

import java.io.UnsupportedEncodingException;
import java.util.List;


public interface AbstractRepository<T, ID> {

    ID save(T t) throws UnsupportedEncodingException;

    T find(ID id);

    boolean update(T t);

    boolean delete(T t);

    List<T> findAll();

    List<T> deleteAll();

    Integer getCurrentId();

    void synchronizeValues();
}
