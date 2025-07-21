/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */
public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String cargo, String departamento) {
        super(nome, salario, cargo);
        this.departamento = departamento;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Departamento: " + departamento;
    }
}

