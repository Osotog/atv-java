/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_animais;

/**
 *
 * @author contr
 */
public class Reptil extends Animal {
    private String tipoEscama;

    public Reptil(String nome, int idade, String tipoEscama) {
        super(nome, idade);
        this.tipoEscama = tipoEscama;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Tipo de Escama: " + tipoEscama;
    }
}

