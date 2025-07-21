/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class ex_8 {
    
    public static void main(String[] args) {
        
        aluno_ex8 a = new aluno_ex8();
        a.nome = "Maria Santos";
        a.matricula = 12345;
        a.notas = new double[]{8.5, 7.0, 9.5, 6.8};
        
        
        System.out.println("Aluno: " + a.nome);
        System.out.println("Matrícula: " + a.matricula);
        
        
        System.out.print("Notas: ");
        for (int i = 0; i < a.notas.length; i++) {
            System.out.print(a.notas[i]);
            if (i < a.notas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        
        System.out.println("Média: " + a.calcularMedia());
    }
    
}
