/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_instrumentosMusicais;

/**
 *
 * @author contr
 */

public class Main {
    public static void main(String[] args) {
        InstrumentoMusical[] banda = new InstrumentoMusical[3];

        banda[0] = new Guitarra();
        banda[1] = new Piano();
        banda[2] = new Bateria();

        System.out.println(" Iniciando apresentação da banda polimórfica:\n");

        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar(); 
        }
    }
}

