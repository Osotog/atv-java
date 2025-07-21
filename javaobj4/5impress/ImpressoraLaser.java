/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_impressoras;

/**
 *
 * @author contr
 */


public class ImpressoraLaser implements Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Impressão a laser em alta velocidade: " + documento);
    }
}

