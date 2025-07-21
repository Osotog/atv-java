/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_funcionarios;

/**
 *
 * @author contr
 */
public class Gerente implements Funcionario {
    private double salarioBase;
    private double bonus;

    public Gerente(double salarioBase, double bonus) {
        this.salarioBase = salarioBase;
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}

