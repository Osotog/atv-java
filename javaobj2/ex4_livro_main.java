/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex4_livro_main {
    
    
    public static void main(String[] args) {
        ex4_livro livro = new ex4_livro("Dom Casmurro", "Machado de Assis", 1899, true);

        System.out.println("Livro: " + livro.getTitulo() + " por " + livro.getAutor());
        System.out.println("Disponível? " + livro.isDisponivel());

        livro.emprestar();
        System.out.println("Disponível? " + livro.isDisponivel());

        livro.devolver();
        System.out.println("Disponível? " + livro.isDisponivel());
    }


    
}
