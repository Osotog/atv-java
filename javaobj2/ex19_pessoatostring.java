/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex19_pessoatostring {
    
    private String nome;
    private int idade;

    
    public ex19_pessoatostring(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    
    @Override
    public String toString() {
        return "Pessoa: " + nome + ", Idade: " + idade + " anos";
    }
}
