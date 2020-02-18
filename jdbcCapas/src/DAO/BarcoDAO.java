package DAO;

import java.util.List;
import Entidades.Barco;

public interface BarcoDAO {

    Barco find(int id) throws Exception;

    List<Barco> getAll() throws Exception;

    void add(Barco barco) throws Exception;

    void update(Barco barco) throws Exception;

    void delete(int id) throws Exception;
}
