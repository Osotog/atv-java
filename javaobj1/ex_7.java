/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex_7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        livro_ex7 livro = new livro_ex7();
        
        System.out.print("digite o titulo do livro: ");
        livro.titulo = sc.nextLine();
        
        System.out.println("digite o autor do livro: ");
        livro.autor = sc.nextLine();
        
        System.out.println("digite o ano de publicação: ");
        livro.anopublicacao = sc.nextInt();
        
        livro.disponivel = true;
        
        System.out.println("## informações do livro cadasttado ##");
        System.out.println("titulo: " +livro.titulo);
        System.out.println("autor: " +livro.autor);
        System.out.println("ano de publicação: " +livro.anopublicacao);
        
        System.out.println("deseja emprestar o livro? (s/n)");
        sc.nextLine(); // consumir nova linha
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            livro.emprestar();
        }
        
        System.out.println("deseja devolver o livro? (s/n)");
        opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            livro.devolver();
        }
        
        sc.close();
        
    }
    
}
