/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_impressoras;

/**
 *
 * @author contr
 */


public class ImpressoraJatoDeTinta implements Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("Imprimindo com jato de tinta: " + documento);
    }
}

