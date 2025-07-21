/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */
public class Desenvolvedor extends Funcionario {
    private String linguagemProgramacao;

    public Desenvolvedor(String nome, double salario, String cargo, String linguagemProgramacao) {
        super(nome, salario, cargo);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Linguagem: " + linguagemProgramacao;
    }
}

