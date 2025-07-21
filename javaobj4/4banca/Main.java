/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_bancaria;

/**
 *
 * @author contr
 */


public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente("001CC", 1000.00);
        ContaPoupanca cp = new ContaPoupanca("002CP", 2000.00);

        cc.depositar(500);
        cc.sacar(1800); 
        cc.exibirSaldo();

        cp.sacar(2100); 
        cp.renderJuros();
        cp.exibirSaldo();
    }
}

