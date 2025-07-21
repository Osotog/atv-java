/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex7_circulo_main {
    
    
    public static void main(String[] args) {
        ex7_circulo circulo = new ex7_circulo(4.0);

        System.out.println("Raio: " + circulo.getRaio());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Circunferência: " + circulo.calcularCircunferencia());
    }


    
}
