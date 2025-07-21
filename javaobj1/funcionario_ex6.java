/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class funcionario_ex6 {
    
    String nome;
    double salario;
    String departamento;
    
    
    void aumentarSalario(double percentual) {
        
        double aumento = salario * percentual / 100;
        
        salario = salario + aumento;
    }
    
}
