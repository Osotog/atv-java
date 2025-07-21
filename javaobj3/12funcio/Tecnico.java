/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_funcionarios;

/**
 *
 * @author contr
 */
public class Tecnico implements Funcionario {
    private double salarioBase;
    private double adicionalTecnico;

    public Tecnico(double salarioBase, double adicionalTecnico) {
        this.salarioBase = salarioBase;
        this.adicionalTecnico = adicionalTecnico;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalTecnico;
    }
}

