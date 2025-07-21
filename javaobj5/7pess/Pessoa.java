/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pessoas;

/**
 *
 * @author contr
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;

    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String exibirDados() {
        return "Nome: " + nome + ", Idade: " + idade + ", Endereço: " + endereco;
    }
}

