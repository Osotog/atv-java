/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_formas;

/**
 *
 * @author contr
 */
public class Triangulo implements Forma {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }
}
