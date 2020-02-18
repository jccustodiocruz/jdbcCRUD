package DAO;

import Connection.MySQLConnectionFactory;
import java.util.List;
import Entidades.Barco;
import Entidades.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class BarcoDaoImp implements BarcoDAO {
    
    private final MySQLConnectionFactory connection;
    
    public BarcoDaoImp(MySQLConnectionFactory connection){
        this.connection = connection;
    }

    @Override
    public Barco find(int id) throws Exception {
        final String sql = "SELECT id_barco, nombre, id_Socio, amarre, cuota FROM Barco WHERE id_barco = ?";

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new Barco(resultSet.getInt("id"), resultSet.getInt("id_Socio"), resultSet.getString("nombre"),
                    resultSet.getInt("amarre"), resultSet.getInt("cuota"));
                }
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Barco> getAll() throws Exception {
        ArrayList<Barco> lista = new ArrayList<>();
        final String sql = "SELECT id, nombre, direccion FROM Socio";
        
        try(Connection connection = this.connection.getConnection(); Statement statement = connection.createStatement()){
            try(ResultSet resultSet = statement.executeQuery(sql)){
                if(resultSet.next()){
                    Barco barco = new Barco(resultSet.getInt("id"), resultSet.getInt("id_Socio"), resultSet.getString("nombre"),
                    resultSet.getInt("amarre"), resultSet.getInt("cuota"));
                    lista.add(barco);
                    return lista;
                }               
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(Barco barco) throws Exception {
        final String sql = "INSERT INTO Barcos(Id_Socio, Nombre, Amarre, Cuota) VALUES (?,?,?,?,)";
        
        try(Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, barco.getIdSocio());
            statement.setString(2, barco.getNombreBarco());
            statement.setInt(3, barco.getNumAmarre());
            statement.setInt(4, barco.getCuotaAmarre());
            try(ResultSet resultSet = statement.executeQuery(sql)){
                      
            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Barco barco) throws Exception {
        final String sql = "UPDATE Barcos SET Id_Socio = ?, Nombre = ?, Amarre = ?, Cuota = ?";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setInt(1, barco.getIdSocio());
            statement.setString(2, barco.getNombreBarco());
            statement.setInt(3, barco.getNumAmarre());
            statement.setInt(4, barco.getCuotaAmarre());

            try (ResultSet resultSet = statement.executeQuery(sql)) {

            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) throws Exception {
        final String sql = "DELETE FROM Barcos WHERE id_barco=?";

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery(sql)) {

            }
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
