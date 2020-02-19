
package Connection;
import java.sql.*;

public class MySQLConnectionFactory implements ConnectionFactory {
    public final String connection;
    private final String password;
    private final String user;
        
    public MySQLConnectionFactory(String host, String database, int port, String user, String password){
        this.user = user;
        this.password = password;
        this.connection = String.format("jdbc:mysql://%s:%d/%s?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC", host, port, database);
    }
    
    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(connection, user, password);
    }
    
}
