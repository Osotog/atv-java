/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex2_contabancaria_main {
    
    
    public static void main(String[] args) {
        ex2_contabancaria conta = new ex2_contabancaria("12345", 1000.0, "Carlos");

        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(500.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.depositar(-200.0); 
    }


    
}
