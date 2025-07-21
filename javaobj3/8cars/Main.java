/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veiculos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        carro.acelerar();
        carro.virar("esquerda");

        moto.acelerar();
        moto.frear();

        bicicleta.acelerar();
        bicicleta.virar("direita");
    }
}

