/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author Aluno
 */
public class carro_ex3 {
    
    String marca;
    String modelo;
    int ano;
    boolean estado;
    
    void ligado () {
        if(estado) {
            estado = false;
            System.out.println("o carro " +modelo+ "esta desligado");
}else{
            System.out.println("o carro" +modelo+ "esta ligado");
        }
    }
    
    
    
}
