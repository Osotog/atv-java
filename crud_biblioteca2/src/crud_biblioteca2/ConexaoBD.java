/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
// URL de conexao que inclui host, porta, banco de dados e usuário
     private static final String URL = "jdbc:mysql://127.0.0.1:3306/cadastro_livro";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public Connection conectar() {
        try {
            System.out.println("Tentando conectar...");
            //Retorna uma conexao ativa
            return DriverManager.getConnection(URL,USUARIO, SENHA);
        } catch (SQLException e) {
            //Exibe uma mensagem de erro caao a conexao falhe
            System.out.println("Erro ao conectar ao banco de dados:");
            e.printStackTrace();
            return null;
        }
    }
}
