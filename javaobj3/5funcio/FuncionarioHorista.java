/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_FuncionariocomInterface;

/**
 *
 * @author contr
 */
public class FuncionarioHorista implements Pagavel {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
}

