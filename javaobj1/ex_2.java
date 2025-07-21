/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author Aluno
 */
public class ex_2 {
    
    
    public static void main(String[] args) {
        contabancaria_ex2 conta1 = new contabancaria_ex2();
        conta1.numeroConta = "12345-6";
        conta1.titular = "Bryan";
        conta1.saldo = 20.0;
        
        conta1.depositar(200);
        conta1.sacar(50);
    }
}
    
    
