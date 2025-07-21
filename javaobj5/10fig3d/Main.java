/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_FigurasGeo3D;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica3D cubo = new Cubo(3);
        FiguraGeometrica3D esfera = new Esfera(2.5);
        FiguraGeometrica3D cilindro = new Cilindro(2, 5);

        System.out.printf("Volume do Cubo: %.2f\n", cubo.calcularVolume());
        System.out.printf("Volume da Esfera: %.2f\n", esfera.calcularVolume());
        System.out.printf("Volume do Cilindro: %.2f\n", cilindro.calcularVolume());
    }
}

