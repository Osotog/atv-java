/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CriarTabela {

    public void criar() {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
// Verifica se a conexao foi estabelecida
        if (conexao != null) {
            // SQL para criar a tabela com id auto-incremento, nome e data
            String sql = "CREATE TABLE IF NOT EXISTS livros ("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(100),"
                    + "data VARCHAR(50)"
                    + ");";

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                // Executa o comando SQL
                ps.execute();
                System.out.println("Tabela 'livros' criada com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao criar a tabela 'livros'");
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
