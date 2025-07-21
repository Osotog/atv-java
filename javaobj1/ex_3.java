/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex_3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        carro_ex3 carro = new carro_ex3();
        
        System.out.println("qual a marca do carro? ");
        carro.marca = sc.nextLine();
        
        System.out.println("qual o modelo do carro? ");
        carro.modelo = sc.nextLine();
        
        System.out.println("qual o ano do carro? ");
        carro.ano = sc.nextInt();
        
        System.out.println("deseja ligar o carro? (s/n)");
        sc.nextLine(); 
        String opcao = sc.nextLine();
        
        if(opcao.equalsIgnoreCase("s")){
            carro.ligado();
        }
        
        
    }
    
}
