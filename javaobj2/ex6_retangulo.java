/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex6_retangulo {
    
    private double largura;
    private double altura;

    
    public ex6_retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    
    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double calcularArea() {
        return largura * altura;
    }

    
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

