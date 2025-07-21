/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_Eletrodomesticos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Televisao tv = new Televisao("LG", "SmartTV", 5, 15);
        Geladeira gel = new Geladeira("Brastemp", "FrostFree", 4);
        Microondas micro = new Microondas("Electrolux", "ME41", 700);

        tv.ligar();
        tv.mudarCanal(10);
        tv.aumentarVolume();
        System.out.println(tv.exibirDados());

        gel.ligar();
        gel.ajustarTemperatura(2);
        System.out.println(gel.exibirDados());

        micro.ligar();
        micro.ajustarPotencia(900);
        System.out.println(micro.exibirDados());
    }
}

