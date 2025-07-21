/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_contasBancarias;

/**
 *
 * @author contr
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String numeroConta, double saldo, double taxaJuros) {
        super(numeroConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Taxa de Juros: " + (taxaJuros * 100) + "%";
    }
}

