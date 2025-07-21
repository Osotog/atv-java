/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_veiculos;

/**
 *
 * @author contr
 */
public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Portas: " + numPortas;
    }
}

