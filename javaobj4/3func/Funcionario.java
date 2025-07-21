/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */


public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
        System.out.println("Bônus: R$" + calcularBonus());
        System.out.println("--------------------------");
    }
}

