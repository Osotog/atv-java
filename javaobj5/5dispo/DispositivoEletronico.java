/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_dispositivosEletronicos;

/**
 *
 * @author contr
 */
public class DispositivoEletronico {
    protected String marca;
    protected String modelo;

    public DispositivoEletronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String exibirDados() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

