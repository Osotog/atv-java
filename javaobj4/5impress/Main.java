/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_impressoras;

/**
 *
 * @author contr
 */


public class Main {
    public static void main(String[] args) {
        Impressora tinta = new ImpressoraJatoDeTinta();
        Impressora laser = new ImpressoraLaser();

        tinta.imprimir("Documento PDF - Contrato");
        laser.imprimir("Relatório Anual - 2025");
    }
}

