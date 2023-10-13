import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DataBaseConnector {
    private static final String url = "jdbc:mysql://localhost:3306/workout";
    private static final String user = "root";
    private static final String password = "Eleonora1992Riccardo1988ZeldaMalu!";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

}
