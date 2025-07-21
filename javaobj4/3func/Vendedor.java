/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */


public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15;
    }
}

