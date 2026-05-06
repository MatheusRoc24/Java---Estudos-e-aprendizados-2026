/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author IFSP
 */
public class Conexao {
    
    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/dbprodutos?serverTimezone=UTC", //URL de conexão
                    "root", //usuario
                    ""  //senha
            );
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
    
}
