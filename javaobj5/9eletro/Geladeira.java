/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_Eletrodomesticos;

/**
 *
 * @author contr
 */
public class Geladeira extends Eletrodomestico {
    private int temperatura;

    public Geladeira(String marca, String modelo, int temperatura) {
        super(marca, modelo);
        this.temperatura = temperatura;
    }

    public void ajustarTemperatura(int novaTemperatura) {
        this.temperatura = novaTemperatura;
        System.out.println("Temperatura ajustada para: " + temperatura + "°C");
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Temperatura: " + temperatura + "°C";
    }
}

