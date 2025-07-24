/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crud_biblioteca2;

import java.sql.SQLException;
import java.util.Scanner;

// Classe principal do sistema CRUD de livros.
 // Exibe um menu interativo para inserir, atualizar, deletar e consultar livros no banco de dados.

public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        InserirLivro inserir = new InserirLivro();
        AtualizarLivro atualizar = new AtualizarLivro();
        DeletarLivro deletar = new DeletarLivro();
        ConsultarLivro consultar = new ConsultarLivro();
        CriarTabela tabela = new CriarTabela();
//garante que a tabela exista 
        tabela.criar();
//Menu interativo
        int op = -1;
        // Loop principal que mantem o programa em execuçao até o usuario escolher sair
        while (op != 0) {
            System.out.println("\n ## MENU CRUD LIVROS ##");
            System.out.println("1. Inserir livros");
            System.out.println("2. Atualizar data do livro");
            System.out.println("3. Deletar livros");
            System.out.println("4. Consultar livros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nomeInserir = sc.nextLine();
                    System.out.print("Data: ");
                    String dataInserir = sc.nextLine();
                    inserir.inserir(nomeInserir, dataInserir);
                    break;
                case 2:
                    System.out.print("Nome do livro para atualizar a data: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.print("Nova data: ");
                    String novaData = sc.nextLine();
                    atualizar.atualizar(nomeAtualizar, novaData);
                    break;
                case 3:
                    System.out.print("Nome do livro para deletar: ");
                    String nomeDeletar = sc.nextLine();
                    deletar.deletar(nomeDeletar);
                    break;
                case 4:
                    consultar.consultar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa ...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }
}
