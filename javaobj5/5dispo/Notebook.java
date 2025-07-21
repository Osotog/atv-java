/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_dispositivosEletronicos;

/**
 *
 * @author contr
 */
public class Notebook extends DispositivoEletronico {
    private int capacidadeArmazenamento; // em GB

    public Notebook(String marca, String modelo, int capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String exibirDados() {
        return super.exibirDados() + ", Armazenamento: " + capacidadeArmazenamento + "GB";
    }
}

