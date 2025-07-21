/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pessoas;

/**
 *
 * @author contr
 */
public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String endereco, String disciplina) {
        super(nome, idade, endereco);
        this.disciplina = disciplina;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Disciplina: " + disciplina;
    }
}

