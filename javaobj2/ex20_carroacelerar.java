/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex20_carroacelerar {
    
    private String modelo;
    private boolean ligado;

    
    public ex20_carroacelerar(String modelo) {
        this.modelo = modelo;
        this.ligado = false;
    }

    
    public void ligar() {
        ligado = true;
        System.out.println("O carro " + modelo + " foi ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("O carro " + modelo + " foi desligado.");
    }

    
    public void acelerar() {
        if (ligado) {
            System.out.println("O carro " + modelo + " está acelerando!");
        } else {
            System.out.println("Não é possível acelerar. O carro " + modelo + " está desligado.");
        }
    }

    
    public String getModelo() {
        return modelo;
    }

    public boolean isLigado() {
        return ligado;
    }
}

