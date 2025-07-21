/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_dispositivoseletronicos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        DispositivoEletronico tv = new Televisao();
        DispositivoEletronico radio = new Radio();
        DispositivoEletronico celular = new Celular();

        tv.ligar();
        radio.desligar();
        celular.ligar();

        System.out.println(tv.obterStatus());
        System.out.println(radio.obterStatus());
        System.out.println(celular.obterStatus());
    }
}

