/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_contasBancarias;

/**
 *
 * @author contr
 */
public class ContaInvestimento extends ContaBancaria {
    private String tipoInvestimento;

    public ContaInvestimento(String numeroConta, double saldo, String tipoInvestimento) {
        super(numeroConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Tipo de Investimento: " + tipoInvestimento;
    }
}

