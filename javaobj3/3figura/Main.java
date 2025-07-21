/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_figurageo;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        FiguraGeometrica circulo = new Circulo(5);
        FiguraGeometrica retangulo = new Retangulo(4, 6);

        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());
    }
}

