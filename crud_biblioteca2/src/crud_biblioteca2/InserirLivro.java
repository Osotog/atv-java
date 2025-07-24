/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Classe responsavel por inserir registros de livros no banco de dados.

public class InserirLivro {

    public void inserir(String nome, String data) {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            // SQL de inserção com parâmetros
            String sql = "INSERT INTO livros (nome, data) VALUES (?, ?)";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, nome);
                ps.setString(2, data);
                ps.executeUpdate();
                System.out.println("Livro inserido com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir livro:");
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
