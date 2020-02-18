package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Connection.ConnectionFactory;
import Connection.MySQLConnectionFactory;
import Entidades.Socio;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SocioDaoImp implements SocioDAO {

    private final ConnectionFactory connection;

    public SocioDaoImp(ConnectionFactory connection) {
        this.connection = connection;
    }

    @Override
    public Socio find(int id) throws Exception {
        final String sql = "SELECT Id_Socio, Nombre, Direccion FROM Socios WHERE id_socio = ?";
        Socio socio = null;

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    socio = new Socio(resultSet.getInt("Id_Socio"), resultSet.getString("Nombre"), resultSet.getString("Direccion"));
                }
            }
        }
        return socio;
    }

    @Override
    public ArrayList<Socio> getAll() throws Exception {
        ArrayList<Socio> lista = new ArrayList<>();
        final String sql = "SELECT Id_Socio, Nombre, Direccion FROM Socios";

        try (Connection connectionEstablecida = this.connection.getConnection(); Statement statement = connectionEstablecida.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {
                while (resultSet.next()) {
                    Socio socio = new Socio(resultSet.getInt("Id_Socio"), resultSet.getString("Nombre"), resultSet.getString("Direccion"));
                    lista.add(socio);
                }
                return lista;
            }
        }
    }

    @Override
    public void add(Socio socio) throws Exception {
        final String sql = "INSERT INTO Socios(Nombre, Direccion) VALUES (?,?)";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setString(1, socio.getNombre());
            statement.setString(2, socio.getDireccion());

            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public void update(Socio socio) throws Exception {
        final String sql = "UPDATE Socios SET Nombre = ?, Direccion = ?";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setString(1, socio.getNombre());
            statement.setString(2, socio.getDireccion());

            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {

            }
        }
    }

    @Override
    public void delete(int id) throws Exception {
        final String sql = "DELETE FROM Socios WHERE id_socio=?";

        try (Connection connectionEstablecida = this.connection.getConnection(); PreparedStatement statement = connectionEstablecida.prepareStatement(sql)) {
            statement.setInt(1, id);
            try {
                statement.executeUpdate(sql);
            } catch (SQLException e) {

            }
        }
    }
}
