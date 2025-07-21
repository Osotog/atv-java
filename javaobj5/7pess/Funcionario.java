/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pessoas;

/**
 *
 * @author contr
 */
public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, int idade, String endereco, String cargo) {
        super(nome, idade, endereco);
        this.cargo = cargo;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Cargo: " + cargo;
    }
}

