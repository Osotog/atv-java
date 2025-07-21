/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_bancaria;

/**
 *
 * @author contr
 */


public class ContaCorrente extends ContaBancaria {
    private final double LIMITE_SAQUE = 500.00;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + LIMITE_SAQUE) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque excede o limite da Conta Corrente.");
            return false;
        }
    }
}

