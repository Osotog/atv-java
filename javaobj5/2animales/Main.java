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
        Mamifero leao = new Mamifero("Leão", 8, "Densa e amarelada");
        Ave aguia = new Ave("Águia", 5, 2.3);
        Reptil cobra = new Reptil("Cobra", 4, "Lisas e brilhantes");

        System.out.println(leao.exibirDados());
        System.out.println(aguia.exibirDados());
        System.out.println(cobra.exibirDados());
    }
}

