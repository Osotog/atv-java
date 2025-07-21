/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_contasBancarias;

/**
 *
 * @author contr
 */
public class ContaCorrente extends ContaBancaria {
    private double limite;

    public ContaCorrente(String numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Limite: R$" + limite;
    }
}

