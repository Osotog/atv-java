/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_formas;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Forma quadrado = new Quadrado(4);
        Forma triangulo = new Triangulo(5);
        Forma circulo = new Circulo(3);

        System.out.println("Quadrado - Área: " + quadrado.calcularArea() + ", Perímetro: " + quadrado.calcularPerimetro());
        System.out.println("Triângulo - Área: " + triangulo.calcularArea() + ", Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Círculo - Área: " + circulo.calcularArea() + ", Perímetro: " + circulo.calcularPerimetro());
    }
}

