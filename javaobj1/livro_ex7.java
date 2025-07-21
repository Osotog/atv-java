/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author Aluno
 */
public class livro_ex7 {
    
    String titulo;
    String autor;
    int anopublicacao;
    boolean disponivel;
    
    void emprestar() {
        if(disponivel){
            disponivel = false;
            System.out.println("livro" +titulo+" emprestado com sucesso");
          }else{
            System.out.println("livro" +titulo+" nao esta disponivel para emprestar");
        }
    }
    
    void devolver() {
        if(!disponivel){
            disponivel = true;
            System.out.println("livro" +titulo+" devolvido com sucesso");
        }else{
            System.out.println("livro" +titulo+" ja esta disponivel");
        }
    }
    
    
}
