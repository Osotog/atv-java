/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class ex_4 {
    
    public static void main(String[] args) {
       
        retangulo_ex4 r = new retangulo_ex4();
        r.base = 5.0;
        r.altura = 3.0;
        
        
        System.out.println("area do retangulo: " + r.calcularArea());
        
        
        System.out.println("Perimetro do retangulo: " + r.calcularPerimetro());
    }
    
}
