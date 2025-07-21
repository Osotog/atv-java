/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_dispositivoseletronicos;

/**
 *
 * @author contr
 */
public class Celular implements DispositivoEletronico {
    private boolean ligado = false;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Celular ligado.");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }

    @Override
    public String obterStatus() {
        return ligado ? "Celular está ligado." : "Celular está desligado.";
    }
}

