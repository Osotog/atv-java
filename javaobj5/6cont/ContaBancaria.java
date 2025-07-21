/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_contasBancarias;

/**
 *
 * @author contr
 */
public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String exibirDados() {
        return "Conta: " + numeroConta + ", Saldo: R$" + saldo;
    }
}

