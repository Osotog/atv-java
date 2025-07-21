/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex20_carroacelerar_main {
    
    
    public static void main(String[] args) {
        ex20_carroacelerar carro1 = new ex20_carroacelerar("Honda Civic");

        carro1.acelerar(); 

        carro1.ligar();
        carro1.acelerar();

        carro1.desligar();
        carro1.acelerar();
    }


    
}
