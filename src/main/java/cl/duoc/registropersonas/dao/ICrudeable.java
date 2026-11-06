package cl.duoc.registropersonas.dao;

import cl.duoc.registropersonas.model.Persona;

import java.io.IOException;
import java.util.List;

public interface ICrudeable<T> {
    //CRUD
    // create
    void create(T t) throws IOException;

    // read
    List<T> readAll() throws IOException;


    /*
    * update
    * delete
    * */
}
