/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_funcionarios;

/**
 *
 * @author contr
 */
public class Vendedor implements Funcionario {
    private double totalVendas;
    private double comissaoPorcentagem;

    public Vendedor(double totalVendas, double comissaoPorcentagem) {
        this.totalVendas = totalVendas;
        this.comissaoPorcentagem = comissaoPorcentagem;
    }

    @Override
    public double calcularSalario() {
        return totalVendas * (comissaoPorcentagem / 100);
    }
}

