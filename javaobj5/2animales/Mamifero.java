/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_animais;

/**
 *
 * @author contr
 */
public class Mamifero extends Animal {
    private String tipoPelo;

    public Mamifero(String nome, int idade, String tipoPelo) {
        super(nome, idade);
        this.tipoPelo = tipoPelo;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Tipo de Pelo: " + tipoPelo;
    }
}

