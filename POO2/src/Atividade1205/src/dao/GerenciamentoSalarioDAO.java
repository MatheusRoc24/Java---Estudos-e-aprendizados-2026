package dao;

import beans.Funcionario;
import beans.GerenciamentoSalario;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoSalarioDAO {

    private Connection conn;

    public GerenciamentoSalarioDAO() {
        this.conn = Conexao.getConexao();
    }

    public void inserir(GerenciamentoSalario g) throws Exception {
        String sql = "INSERT INTO gerenciamento_salario(funcionarioid, bonus, hora_extra) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, g.getFuncionario().getId());
            stmt.setDouble(2, g.getBonus());
            stmt.setInt(3, g.getHoraExtra());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao inserir: " + e.getMessage());
        }
    }

    public void editar(GerenciamentoSalario g) throws Exception {
        String sql = "UPDATE gerenciamento_salario SET funcionarioid = ?, bonus = ?, hora_extra = ? WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, g.getFuncionario().getId());
            stmt.setDouble(2, g.getBonus());
            stmt.setInt(3, g.getHoraExtra());
            stmt.setInt(4, g.getId());
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao editar: " + e.getMessage());
        }
    }

    public void excluir(int id) throws Exception {
        String sql = "DELETE FROM gerenciamento_salario WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (Exception e) {
            throw new Exception("Erro ao excluir: " + e.getMessage());
        }
    }

    public List<GerenciamentoSalario> getAll() throws Exception {
        List<GerenciamentoSalario> lista = new ArrayList<>();
        String sql = "SELECT * FROM gerenciamento_salario";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            FuncionarioDAO funcDao = new FuncionarioDAO();
            while (rs.next()) {
                GerenciamentoSalario g = new GerenciamentoSalario();
                g.setId(rs.getInt("id"));
                g.setBonus(rs.getDouble("bonus"));
                g.setHoraExtra(rs.getInt("hora_extra"));
                Funcionario f = funcDao.getById(rs.getInt("funcionarioid"));
                g.setFuncionario(f);
                lista.add(g);
            }
            stmt.close();
            return lista;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar registros: " + e.getMessage());
        }
    }

    public GerenciamentoSalario getById(int id) throws Exception {
        String sql = "SELECT * FROM gerenciamento_salario WHERE id = ?";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            FuncionarioDAO funcDao = new FuncionarioDAO();
            if (rs.next()) {
                GerenciamentoSalario g = new GerenciamentoSalario();
                g.setId(rs.getInt("id"));
                g.setBonus(rs.getDouble("bonus"));
                g.setHoraExtra(rs.getInt("hora_extra"));
                Funcionario f = funcDao.getById(rs.getInt("funcionarioid"));
                g.setFuncionario(f);
                stmt.close();
                return g;
            }
            stmt.close();
            return null;
        } catch (Exception e) {
            throw new Exception("Erro ao buscar pelo ID: " + e.getMessage());
        }
    }
}
