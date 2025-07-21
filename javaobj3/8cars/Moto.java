/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veiculos;

/**
 *
 * @author contr
 */
public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Moto virando para a " + direcao);
    }
}

