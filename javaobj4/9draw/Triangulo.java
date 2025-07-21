/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_desenhos;

/**
 *
 * @author contr
 */

public class Triangulo implements Desenho {
    @Override
    public void desenhar() {
        System.out.println("Triângulo desenhado:");
        System.out.println("   *   ");
        System.out.println("  ***  ");
        System.out.println(" ***** ");
        System.out.println("*******");
    }
}

