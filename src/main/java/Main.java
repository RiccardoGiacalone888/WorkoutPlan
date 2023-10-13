import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        // Esempio di utilizzo delle classi DatabaseConnector e AllenamentiManager
        String tipoEsercizio = "Panca piana";
        String data = "2023-10-13";
        int set = 3;
        int ripetizioni = 12;
        double peso = 100.0;

        // Connessione al database
        try {
            Connection connection = DataBaseConnector.getConnection();

            // Aggiungi un allenamento al database
            AllenamentiManager.aggiungiAllenamento(tipoEsercizio, data, set, ripetizioni, peso);

            // Chiudi la connessione al database
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
