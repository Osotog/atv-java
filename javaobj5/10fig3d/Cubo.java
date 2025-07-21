/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_FigurasGeo3D;

/**
 *
 * @author contr
 */
public class Cubo extends FiguraGeometrica3D {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularVolume() {
        return Math.pow(lado, 3);
    }
}
