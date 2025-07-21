/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class ex_5 {
    
    public static void main(String[] args) {
        
        circulo_ex5 c = new circulo_ex5();
        c.raio = 5.0;
        
        
        System.out.println("area do circulo: " + c.calcularArea());
        
        
        System.out.println("Circunferencia do circulo: " + c.calcularCircunferencia());
    }
    
}
