package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Maile caminho, usuario, senha
 */
public class modoconexao {

    public Statement stmt;
    public ResultSet rs;
    private static Connection conn;
    private static final String driver = "org.firebirdsql.jdbc.FBDriver";
    private static final String caminho = "jdbc:firebirdsql:localhost/3050:C:\\Users\\bebec\\Downloads\\Banco de Dados\\TRABALHO.FDB";
    private static final String usuario = "sysdba";
    private static final String senha = "masterkey";

    public static Connection conexao() {
        conn = null;
        try {
            System.setProperty("org.firebirdsql.jdbc.FBDriver", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Complete o login para se conectar!");
        }
        return conn;
    }

    public void desconecta() {

        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão!" + ex.getMessage());
        }

    }

}
