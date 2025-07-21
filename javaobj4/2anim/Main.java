/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_animais;

/**
 *
 * @author contr
 */


public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];
        animais[0] = new Cachorro();
        animais[1] = new Gato();
        animais[2] = new Vaca();

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

