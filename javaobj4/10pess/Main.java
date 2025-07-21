/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_pessoas;

/**
 *
 * @author contr
 */

public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];

        pessoas[0] = new Professor("Carla", 40, "Matemática");
        pessoas[1] = new Aluno("Lucas", 19, "Engenharia");
        pessoas[2] = new Funcionario("João", 35, "TI");

        System.out.println(" Lista de pessoas se apresentando:\n");

        for (Pessoa p : pessoas) {
            p.apresentar(); 
        }
    }
}

