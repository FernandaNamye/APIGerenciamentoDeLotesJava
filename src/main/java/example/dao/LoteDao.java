package example.dao;

import example.model.Lote;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class LoteDao {

    private final String url = "jdbc:mysql://localhost:3306/Gerenciamento_Lotes";
    private final String user = "root";
    private final String password = System.getenv("DB_PASSWORD");

    public void salvar(Lote lote) {

        String sql = "INSERT INTO dados (lote, tipo, cor, nºmétrico, operador) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, lote.getLote());
            stmt.setString(2, lote.getTipo());
            stmt.setInt(3, lote.getCor());
            stmt.setFloat(4, lote.getnMetrico());
            stmt.setString(5, lote.getoperador());


            stmt.executeUpdate();



        } catch (SQLException e) { throw new RuntimeException(e); }
    }

    public List<Lote> listarTodos() {
        List<Lote> lista = new ArrayList<>();
        String sql = "SELECT * FROM dados";


        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Lote l = new Lote();
                l.setId(rs.getInt("id"));
                l.setLote(rs.getInt("lote"));
                l.setTipo(rs.getString("tipo"));
                l.setCor(rs.getInt("cor"));
                l.setnMetrico(rs.getFloat("nºmétrico"));
                l.setoperador(rs.getString("operador"));
                lista.add(l);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }
}