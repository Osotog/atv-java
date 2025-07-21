/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex3_carro_main {
    
    
    public static void main(String[] args) {
        ex3_carro carro = new ex3_carro("Toyota", "Corolla", 2021, false);

        System.out.println("Carro: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Está ligado? " + carro.isLigado());

        carro.ligar();
        System.out.println("Está ligado? " + carro.isLigado());

        carro.desligar();
        System.out.println("Está ligado? " + carro.isLigado());
    }


    
}
