package DAO;

import java.util.List;
import Entidades.Socio;
import java.util.ArrayList;

public interface SocioDAO {

    Socio find(int id) throws Exception;

    ArrayList<Socio> getAll() throws Exception;

    void add(Socio socio) throws Exception;

    void update(Socio socio) throws Exception;

    void delete(int id) throws Exception;
}
