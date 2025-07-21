/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_FigurasGeo3D;

/**
 *
 * @author contr
 */
public class Esfera extends FiguraGeometrica3D {
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
}

