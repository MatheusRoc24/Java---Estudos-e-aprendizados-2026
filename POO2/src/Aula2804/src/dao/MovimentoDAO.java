package dao;

import beans.Movimento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import conexao.Conexao;

public class MovimentoDAO {

    private Connection conn;

    public MovimentoDAO() {
        this.conn = Conexao.getConexao();
    }
    public void salvar(Movimento m) throws Exception{
        String sql = "INSERT INTO movimentos(tipo, quantidade , produtoid"
                + "VALUES (?,?,?,?)";
        
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, m.getTipo());
            stmt.setInt(2, m.getQuantidade());
            stmt.setInt(3, m.getProduto().getId());
        } catch (Exception e) {
            throw new Exception("Erro ao salvar movimentos: " + e.getMessage());
        }
    }
}
