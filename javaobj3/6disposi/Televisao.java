/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_dispositivoseletronicos;

/**
 *
 * @author contr
 */
public class Televisao implements DispositivoEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Televisão ligada.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Televisão desligada.");
    }

    @Override
    public String obterStatus() {
        return ligado ? "Televisão está ligada." : "Televisão está desligada.";
    }
}

