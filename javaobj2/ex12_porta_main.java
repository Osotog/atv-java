/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex12_porta_main {
    
    
    public static void main(String[] args) {
        ex12_porta porta = new ex12_porta(false, "Branca");

        System.out.println("Porta está aberta? " + porta.isAberta());
        System.out.println("Cor da porta: " + porta.getCor());

        porta.abrir();
        porta.fechar();
    }


    
}
