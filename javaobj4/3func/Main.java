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
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Gerente("Alice", 10000.00);
        funcionarios[1] = new Vendedor("Bruno", 6000.00);
        funcionarios[2] = new Desenvolvedor("Carla", 8000.00);

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
        }
    }
}

