/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_Eletrodomesticos;

/**
 *
 * @author contr
 */
public class Televisao extends Eletrodomestico {
    private int canal;
    private int volume;

    public Televisao(String marca, String modelo, int canal, int volume) {
        super(marca, modelo);
        this.canal = canal;
        this.volume = volume;
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Canal: " + canal + ", Volume: " + volume;
    }
}

