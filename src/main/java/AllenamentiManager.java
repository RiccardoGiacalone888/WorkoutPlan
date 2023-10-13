import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AllenamentiManager {
    public static void aggiungiAllenamento(String tipoEsercizio, String dataAllenamento, int numeroSet, int ripetizioni, double peso) {
        String insertQuery = "INSERT INTO allenamenti (tipo_esercizio, data_allenamento, numero_set, ripetizioni, peso) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DataBaseConnector.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, tipoEsercizio);
            preparedStatement.setString(2, dataAllenamento);
            preparedStatement.setInt(3, numeroSet);
            preparedStatement.setInt(4, ripetizioni);
            preparedStatement.setDouble(5, peso);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
