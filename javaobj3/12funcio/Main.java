/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex12_funcionarios;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente(5000, 1500);
        Funcionario vendedor = new Vendedor(20000, 5); // 5% de comissão
        Funcionario tecnico = new Tecnico(3000, 500);

        System.out.println("Salário do Gerente: R$" + gerente.calcularSalario());
        System.out.println("Salário do Vendedor: R$" + vendedor.calcularSalario());
        System.out.println("Salário do Técnico: R$" + tecnico.calcularSalario());
    }
}

