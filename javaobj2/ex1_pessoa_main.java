/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex1_pessoa_main {
    
    
    public static void main(String[] args) {
        ex1_pessoa pessoa1 = new ex1_pessoa("Lucas", 30, 1.75);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());
    }

}