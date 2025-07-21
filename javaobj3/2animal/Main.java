/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2_animal;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal passaro = new Passaro();

        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();
    }
}


