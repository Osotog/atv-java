/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex16_aviao_main {
    
    
    public static void main(String[] args) {
        
        ex16_aviao aviao1 = new ex16_aviao("Boeing 737", 180, 850.0);
        ex16_aviao aviao2 = new ex16_aviao("Airbus A380", 853, 1020.0);

        
        System.out.println("Avião 1:");
        System.out.println("Modelo: " + aviao1.getModelo());
        System.out.println("Capacidade: " + aviao1.getCapacidadePassageiros() + " passageiros");
        System.out.println("Velocidade Máxima: " + aviao1.getVelocidadeMaxima() + " km/h");

        System.out.println();

        System.out.println("Avião 2:");
        System.out.println("Modelo: " + aviao2.getModelo());
        System.out.println("Capacidade: " + aviao2.getCapacidadePassageiros() + " passageiros");
        System.out.println("Velocidade Máxima: " + aviao2.getVelocidadeMaxima() + " km/h");
    }


    
}
