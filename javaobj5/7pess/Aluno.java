/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pessoas;

/**
 *
 * @author contr
 */
public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String endereco, String matricula) {
        super(nome, idade, endereco);
        this.matricula = matricula;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Matrícula: " + matricula;
    }
}
