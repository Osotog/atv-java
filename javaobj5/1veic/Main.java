/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex1_veiculos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB500", 2021, 500);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 18000);

        System.out.println(carro.exibirDados());
        System.out.println(moto.exibirDados());
        System.out.println(caminhao.exibirDados());
    }
}

