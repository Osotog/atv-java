/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_desenhos;

/**
 *
 * @author contr
 */

public class Main {
    public static void main(String[] args) {
        Desenho[] formas = new Desenho[3];

        formas[0] = new Circulo();
        formas[1] = new Quadrado();
        formas[2] = new Triangulo();

        System.out.println(" Apresentando desenhos em forma polimórfica:\n");

        for (Desenho forma : formas) {
            forma.desenhar();
            System.out.println(); 
        }
    }
}

