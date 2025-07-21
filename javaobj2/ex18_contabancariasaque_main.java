/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex18_contabancariasaque_main {
    
    
    public static void main(String[] args) {
        ex18_contabancariasaque conta = new ex18_contabancariasaque("Alice", 1000.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$" + conta.getSaldo());

        
        double valorSaque = 250.0;
        if (conta.sacar(valorSaque)) {
            System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
        } else {
            System.out.println("Saque de R$" + valorSaque + " falhou. Saldo insuficiente.");
        }

        System.out.println("Saldo final: R$" + conta.getSaldo());
    }


    
}
