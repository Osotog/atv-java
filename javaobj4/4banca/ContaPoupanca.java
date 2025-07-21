/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_bancaria;

/**
 *
 * @author contr
 */


public class ContaPoupanca extends ContaBancaria {
    private final double TAXA_RENDIMENTO = 0.005; // 0.5% ao mês

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente na Conta Poupança.");
            return false;
        }
    }

    public void renderJuros() {
        double rendimento = saldo * TAXA_RENDIMENTO;
        saldo += rendimento;
        System.out.println("Rendimento aplicado: R$" + rendimento);
    }
}

