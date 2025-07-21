/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_bancaria;

/**
 *
 * @author contr
 */


public abstract class ContaBancaria {
    protected double saldo;
    protected String numeroConta;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);
    public abstract boolean sacar(double valor);

    public void exibirSaldo() {
        System.out.println("Conta: " + numeroConta + " | Saldo: R$" + saldo);
    }
}

