/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeletarLivro {
    public void deletar(String nome) {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            // SQL que deleta o livro pelo nome
            String sql = "DELETE FROM livros WHERE nome = ?";
            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setString(1, nome);
                // Executa a delecao
                int linhas = ps.executeUpdate();

                if (linhas > 0)
                    System.out.println("Livro deletado com sucesso!");
                else
                    System.out.println("Livro não encontrado.");
            } catch (SQLException e) {
                System.out.println("Erro ao deletar livro:");
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
