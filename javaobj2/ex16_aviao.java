/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex16_aviao {
    
    private String modelo;
    private int capacidadePassageiros;
    private double velocidadeMaxima;

    
    public ex16_aviao(String modelo, int capacidadePassageiros, double velocidadeMaxima) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    
    public String getModelo() {
        return modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}

