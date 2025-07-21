/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex15_empregado_main {
    
    
    public static void main(String[] args) {
        ex15_empregado empregado = new ex15_empregado("Lucas Oliveira", "Analista de Sistemas", 5000.00);

        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Cargo: " + empregado.getCargo());
        System.out.println("Salário: R$ " + empregado.getSalario());
        System.out.println("Bônus: R$ " + empregado.calcularBonus());
    }


    
}
