package dao;

import beans.Funcionario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {

    private Connection conn;

    public FuncionarioDAO() {
        this.conn = Conexao.getConexao();
    }

    public void inserir(Funcionario funcionario) throws Exception {
        String sql = "INSERT INTO funcionario(nomeFuncionario, salario) VALUES (?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setDouble(2, funcionario.getSalario());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao inserir: " + e.getMessage());
        }
    }

    public void editar(Funcionario funcionario) throws Exception {
        String sql = "UPDATE funcionario SET nomeFuncionario = ?, salario = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, funcionario.getNomeFuncionario());
            stmt.setDouble(2, funcionario.getSalario());
            stmt.setInt(3, funcionario.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao editar: " + e.getMessage());
        }
    }

    public void excluir(int id) throws Exception {
        String sql = "DELETE FROM funcionario WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao excluir: " + e.getMessage());
        }
    }

    public List<Funcionario> getAll() throws Exception {
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionario";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNomeFuncionario(rs.getString("nomeFuncionario"));
                f.setSalario(rs.getDouble("salario"));
                lista.add(f);
            }
            stmt.close();
            return lista;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar funcionários: " + e.getMessage());
        }
    }

    public Funcionario getById(int id) throws Exception {
        String sql = "SELECT * FROM funcionario WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id"));
                f.setNomeFuncionario(rs.getString("nomeFuncionario"));
                f.setSalario(rs.getDouble("salario"));
                stmt.close();
                return f;
            }
            stmt.close();
            return null;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar funcionário pelo ID: " + e.getMessage());
        }
    }
}
