
package Connection;
import java.sql.*;

public interface ConnectionFactory {
    Connection getConnection() throws SQLException;    
}
