/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_jogos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Jogo jogo1 = new JogoTabuleiro();
        Jogo jogo2 = new JogoCartas();
        Jogo jogo3 = new JogoVideoGame();

        jogo1.jogar();
        jogo2.jogar();
        jogo3.jogar();
    }
}

