/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_veiculos;

/**
 *
 * @author contr
 */
public class Caminhao extends Veiculo {
    private int capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Capacidade de carga: " + capacidadeCarga + "kg";
    }
}
