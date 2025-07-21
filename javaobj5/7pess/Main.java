/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pessoas;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 20, "Rua A, 123", "2023001");
        Professor professor = new Professor("Fernanda", 40, "Av. Central, 456", "Matemática");
        Funcionario funcionario = new Funcionario("Carlos", 35, "Rua B, 789", "Bibliotecário");

        System.out.println(aluno.exibirDados());
        System.out.println(professor.exibirDados());
        System.out.println(funcionario.exibirDados());
    }
}

