/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_animais;

/**
 *
 * @author contr
 */
public class Ave extends Animal {
    private double envergaduraAsas;

    public Ave(String nome, int idade, double envergaduraAsas) {
        super(nome, idade);
        this.envergaduraAsas = envergaduraAsas;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Envergadura das Asas: " + envergaduraAsas + " metros";
    }
}

