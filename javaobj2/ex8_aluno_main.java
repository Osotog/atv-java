/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex8_aluno_main {
    
    
    public static void main(String[] args) {
        double[] notasAluno = {8.5, 7.0, 9.0, 6.5};
        ex8_aluno aluno = new ex8_aluno("Maria Silva", "2023001", notasAluno);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média das notas: " + aluno.calcularMedia());
    }


    
}
