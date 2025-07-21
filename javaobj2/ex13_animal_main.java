/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex13_animal_main {
    
    
    public static void main(String[] args) {
        ex13_animal animal = new ex13_animal("Bolt", "Cachorro");

        System.out.println("Nome do animal: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
    }


    
}
