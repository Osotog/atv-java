/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_pessoas;

/**
 *
 * @author contr
 */

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println(" Olá, sou o Professor " + nome + ", tenho " + idade + " anos e leciono " + disciplina + ".");
    }
}

