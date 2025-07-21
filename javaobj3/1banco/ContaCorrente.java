/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_contaBancaria;

/**
 *
 * @author contr
 */
public class ContaCorrente implements Conta {
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0.0;
    }

    public ContaCorrente(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo inicial não pode ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque inválido.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return;
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}

