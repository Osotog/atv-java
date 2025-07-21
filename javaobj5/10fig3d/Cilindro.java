/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_FigurasGeo3D;

/**
 *
 * @author contr
 */
public class Cilindro extends FiguraGeometrica3D {
    private double raio;
    private double altura;

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    @Override
    public double calcularVolume() {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
}

