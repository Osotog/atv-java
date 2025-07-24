/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Classe responsavel por atualizar a data dew um livro com base no nome.

public class AtualizarLivro {
    public void atualizar(String nome, String novaData) {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            String sql = "UPDATE livros SET data = ? WHERE nome = ?";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, novaData);
                ps.setString(2, nome);
                // Executa e verifica quantas linhas foram afetadas
                int linhasAfetadas = ps.executeUpdate();

                if (linhasAfetadas > 0)
                    System.out.println("Livro atualizado com sucesso!");
                else
                    System.out.println("Livro não encontrado.");
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar livro:");
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
