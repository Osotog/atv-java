/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */
public class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salario, String cargo, double comissao) {
        super(nome, salario, cargo);
        this.comissao = comissao;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Comissão: R$" + comissao;
    }
}
