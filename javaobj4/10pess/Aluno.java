/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_pessoas;

/**
 *
 * @author contr
 */

public class Aluno extends Pessoa {
    private String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public void apresentar() {
        System.out.println(" Olá, sou o Aluno " + nome + ", tenho " + idade + " anos e estudo " + curso + ".");
    }
}

