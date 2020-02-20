package DAO;

import Connection.ConnectionFactory;
import Entidades.Salida;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SalidaDaoImp implements SalidaDAO{
    
    private final ConnectionFactory connection;

    public SalidaDaoImp(ConnectionFactory connection) {
        this.connection = connection;
    }

    @Override
    public ArrayList<Salida> getAll() throws Exception {
        ArrayList<Salida> lista = new ArrayList<>();
        String sql = "SELECT Id_Barco, Destino, Fecha, Hora FROM Salidas";

        try (Connection connectionEstablecida = this.connection.getConnection(); Statement statement = connectionEstablecida.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {                
                while (resultSet.next()) {
                    Salida salida = new Salida(resultSet.getInt("Id_Barco"), resultSet.getString("Destino"), resultSet.getString("Fecha"), resultSet.getInt("Hora"));
                    lista.add(salida);
                }
                return lista;
            }
        }
    }

    @Override
    public void add(Salida salida) throws Exception {
        
    }
    
}
