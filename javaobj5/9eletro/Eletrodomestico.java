/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_Eletrodomesticos;

/**
 *
 * @author contr
 */
public class Eletrodomestico {
    protected String marca;
    protected String modelo;
    protected boolean ligado;

    public Eletrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(marca + " " + modelo + " ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println(marca + " " + modelo + " desligado.");
    }

    public String exibirDados() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ligado: " + ligado;
    }
}

