/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex9_funcionario_main {
    
   
    public static void main(String[] args) {
        ex9_funcionario funcionario = new ex9_funcionario("João Pedro", 4500.00, "TI");

        System.out.println("Funcionário: " + funcionario.getNome());
        System.out.println("Salário atual: R$ " + funcionario.getSalario());

        funcionario.aumentarSalario(10); 
        System.out.println("Novo salário: R$ " + funcionario.getSalario());
    }


    
}
