/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex7_circulo {
   
    private double raio;

    
    public ex7_circulo(double raio) {
        this.raio = raio;
    }

    
    public double getRaio() {
        return raio;
    }

    
    public void setRaio(double raio) {
        this.raio = raio;
    }

   
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    
    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}

