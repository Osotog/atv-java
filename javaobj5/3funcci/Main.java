/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3_funcionarios;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Ana", 9500.00, "Gerente", "RH");
        Vendedor vendedor = new Vendedor("Carlos", 4000.00, "Vendedor", 800.00);
        Desenvolvedor dev = new Desenvolvedor("Lucas", 7000.00, "Dev Sênior", "Java");

        System.out.println(gerente.exibirDados());
        System.out.println(vendedor.exibirDados());
        System.out.println(dev.exibirDados());
    }
}

