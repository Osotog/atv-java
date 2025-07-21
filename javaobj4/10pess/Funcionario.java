/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_pessoas;

/**
 *
 * @author contr
 */

public class Funcionario extends Pessoa {
    private String setor;

    public Funcionario(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    @Override
    public void apresentar() {
        System.out.println(" Olá, sou o Funcionário " + nome + ", tenho " + idade + " anos e trabalho no setor de " + setor + ".");
    }
}

