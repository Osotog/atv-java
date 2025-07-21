/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_transporte;

/**
 *
 * @author contr
 */

public class Main {
    public static void main(String[] args) {
        MeioTransporte[] transportes = new MeioTransporte[3];

        transportes[0] = new Carro();
        transportes[1] = new Aviao();
        transportes[2] = new Navio();

        System.out.println(" Iniciando movimentação dos meios de transporte:\n");

        for (MeioTransporte transporte : transportes) {
            transporte.mover(); 
        }
    }
}

