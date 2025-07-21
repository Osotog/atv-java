/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_Eletrodomesticos;

/**
 *
 * @author contr
 */
public class Microondas extends Eletrodomestico {
    private int potencia;

    public Microondas(String marca, String modelo, int potencia) {
        super(marca, modelo);
        this.potencia = potencia;
    }

    public void ajustarPotencia(int novaPotencia) {
        this.potencia = novaPotencia;
        System.out.println("Potência ajustada para: " + potencia + "W");
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Potência: " + potencia + "W";
    }
}

