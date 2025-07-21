/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex17_livro_main {
    
    
    public static void main(String[] args) {
        
        ex17_livro livro1 = new ex17_livro("Dom Casmurro", "Machado de Assis");
        ex17_livro livro2 = new ex17_livro("1984", "George Orwell", 1949);

        
        System.out.println("Livro 1:");
        System.out.println("Título: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Ano de Publicação: " + livro1.getAnoPublicacao());

        System.out.println();

        System.out.println("Livro 2:");
        System.out.println("Título: " + livro2.getTitulo());
        System.out.println("Autor: " + livro2.getAutor());
        System.out.println("Ano de Publicação: " + livro2.getAnoPublicacao());
    }


    
}
