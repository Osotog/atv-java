/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_contaBancaria;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new ContaCorrente(1000);
        minhaConta.depositar(500);
        minhaConta.sacar(200);
        minhaConta.sacar(1500);
    }
}



