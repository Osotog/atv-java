/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex11_televisao_main {
    
    
    public static void main(String[] args) {
        ex11_televisao tv = new ex11_televisao(10, 5);

        System.out.println("Volume inicial: " + tv.getVolume());
        System.out.println("Canal inicial: " + tv.getCanal());

        tv.aumentarVolume();
        tv.diminuirVolume();
        tv.trocarCanal(12);
    }


    
}
