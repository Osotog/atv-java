/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_dispositivosEletronicos;

/**
 *
 * @author contr
 */
public class Smartphone extends DispositivoEletronico {
    private double tamanhoTela;

    public Smartphone(String marca, String modelo, double tamanhoTela) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Tamanho da Tela: " + tamanhoTela + "''";
    }
}

