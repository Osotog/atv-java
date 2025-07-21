/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex6_retangulo_main {
    
    
    public static void main(String[] args) {
        ex6_retangulo retangulo = new ex6_retangulo(5.0, 3.0);

        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }


    
}
