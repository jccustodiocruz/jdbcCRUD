package DAO;

import Entidades.Salida;
import java.util.ArrayList;

public interface SalidaDAO {
    
    ArrayList<Salida> getAll() throws Exception;

    void add(Salida salida) throws Exception;
}
