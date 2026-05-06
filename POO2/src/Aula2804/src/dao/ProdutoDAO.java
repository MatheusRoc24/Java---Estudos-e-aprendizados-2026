/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Produto;
import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IFSP
 */
public class ProdutoDAO {

    private Connection conn;

    public ProdutoDAO() {
        this.conn = Conexao.getConexao();
    }

    public void salvar(Produto produto) throws Exception {
        String sql = "INSERT INTO produtos(nomeproduto, valor) VALUES (?, ?)";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNomeproduto());
            stmt.setInt(2, produto.getValor());
            stmt.execute();
        } catch (Exception e) {
            //lançar uma nova exception!
            throw new Exception("Erro ao salvar: " + e.getMessage());
        }
    }

    public void atualizar(Produto produto) throws Exception {
        String sql = "UPDATE produtos SET nomeproduto=?, valor=? WHERE id=?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, produto.getNomeproduto());
            stmt.setInt(2, produto.getValor());
            stmt.setInt(3, produto.getId());
            stmt.execute();
        } catch (Exception e) {
            //lançar uma nova exception!
            throw new Exception("Erro ao atualizar: " + e.getMessage());
        }
    }

    public Produto getProduto(int id) throws Exception {
        String sql = "SELECT * FROM produtos WHERE id = ?";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            rs.first();
            Produto p = new Produto();
            p.setId(rs.getInt("id"));
            p.setNomeproduto(rs.getString("nomeproduto"));
            p.setValor(rs.getInt("valor"));
            return p;
        } catch (Exception e) {
            throw new Exception("Produto não encontrado");
        }
    }

    public List<Produto> getProdutos() throws Exception {
        List<Produto> lista = new ArrayList();
        String sql = "SELECT * FROM produtos";

        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
            Produto p = new Produto();
            p.setId(rs.getInt("id"));
            p.setNomeproduto(rs.getString("nomeproduto"));
            p.setValor(rs.getInt("valor"));
            
            lista.add(p);
            }
            
            return lista;
            
        } catch (Exception e) {
             throw new Exception("Erro ao buscar produtos  " + e.getMessage());
        }
    }
}
