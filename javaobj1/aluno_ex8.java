/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class aluno_ex8 {
    
    String nome;
    int matricula;
    double[] notas;
    
    
    double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0; 
        }
        
        double soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        
        return soma / notas.length;
    }
    
}
