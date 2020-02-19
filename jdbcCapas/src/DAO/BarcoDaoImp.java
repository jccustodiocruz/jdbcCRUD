package DAO;

import Connection.ConnectionFactory;
import Connection.MySQLConnectionFactory;
import java.util.List;
import Entidades.Barco;
import Entidades.Socio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BarcoDaoImp implements BarcoDAO {

    private final ConnectionFactory connection;

    public BarcoDaoImp(ConnectionFactory connection) {
        this.connection = connection;
    }

    @Override
    public Barco find(int id) throws Exception {
        final String sql = "SELECT id_barco, nombre, id_Socio, amarre, cuota FROM Barcos WHERE id_Barco = ?";
        Barco barco = null;

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    barco = new Barco(resultSet.getInt("Id_Barco"), resultSet.getInt("id_Socio"), resultSet.getString("Nombre"),
                            resultSet.getInt("Amarre"), resultSet.getInt("Cuota"));
                }
            }
        }
        return barco;
    }

    @Override
    public List<Barco> getAll() throws Exception {
        ArrayList<Barco> lista = new ArrayList<>();
        final String sql = "SELECT Id_Barco,Id_Socio, Nombre, Amarre, Cuota FROM Barcos";

        try (Connection connection = this.connection.getConnection(); Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    Barco barco = new Barco(resultSet.getInt("Id_Barco"), resultSet.getInt("Id_Socio"), resultSet.getString("nombre"),
                            resultSet.getInt("Amarre"), resultSet.getInt("Cuota"));
                    lista.add(barco);
                }
                return lista;
            }
        }
    }

    @Override
    public void add(Barco barco) throws Exception {
        final String sql = "INSERT INTO Barcos(Id_Socio, Nombre, Amarre, Cuota) VALUES (?,?,?,?,)";

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, barco.getIdSocio());
            statement.setString(2, barco.getNombreBarco());
            statement.setInt(3, barco.getNumAmarre());
            statement.setInt(4, barco.getCuotaAmarre());
            try {
                statement.executeUpdate();
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public void update(Barco barco) throws Exception {
        final String sql = "UPDATE Barcos SET Id_Socio = ?, Nombre = ?, Amarre = ?, Cuota = ?";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setInt(1, barco.getIdSocio());
            statement.setString(2, barco.getNombreBarco());
            statement.setInt(3, barco.getNumAmarre());
            statement.setInt(4, barco.getCuotaAmarre());

            try {
                statement.executeUpdate();
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public void delete(int id) throws Exception {
        final String sql = "DELETE FROM Barcos WHERE id_barco = ?";

        try (Connection connection = this.connection.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try {
                statement.executeUpdate();
            } catch (SQLException e) {

            }
        }
    }
}
