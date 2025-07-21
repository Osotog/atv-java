/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veiculos;

/**
 *
 * @author contr
 */
public class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta ganhando velocidade...");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta reduzindo velocidade...");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Bicicleta virando para a " + direcao);
    }
}

