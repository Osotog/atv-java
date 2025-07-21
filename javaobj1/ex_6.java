/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class ex_6 {
    
    public static void main(String[] args) {
        
        funcionario_ex6 f = new funcionario_ex6();
        f.nome = "Carlos Silva";
        f.salario = 3000.0;
        f.departamento = "TI";
        
        
        System.out.println("Funcionário: " + f.nome);
        System.out.println("Departamento: " + f.departamento);
        System.out.println("Salário inicial: R$ " + f.salario);
        
        
        f.aumentarSalario(10);
        
        
        System.out.println("Salário após aumento: R$ " + f.salario);
    }
    
}
