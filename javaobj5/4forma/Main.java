/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_formasgeo;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(4, 6);
        FormaGeometrica triangulo = new Triangulo(3, 8);

        System.out.printf("Área do Círculo: %.2f\n", circulo.calcularArea());
        System.out.printf("Área do Retângulo: %.2f\n", retangulo.calcularArea());
        System.out.printf("Área do Triângulo: %.2f\n", triangulo.calcularArea());
    }
}
