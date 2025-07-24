/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarLivro {
    public void consultar() {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            String sql = "SELECT * FROM livros ORDER BY nome ASC";
            try (PreparedStatement ps = conexao.prepareStatement(sql);
                 ResultSet resultado = ps.executeQuery()) {

                System.out.println("Lista de livros:");
                // Itera sobre os resultados e exibe cada livro
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    String data = resultado.getString("data");
                    System.out.println("ID: " + id + " | Nome: " + nome + " | Data: " + data);
                }
            } catch (SQLException e) {
                System.out.println("Erro ao consultar livros:");
                e.printStackTrace();
            } finally {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
