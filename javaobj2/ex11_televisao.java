/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex11_televisao {
    
    private int volume;
    private int canal;

    
    public ex11_televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    
    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    
    public void aumentarVolume() {
        volume++;
        System.out.println("Volume aumentado para: " + volume);
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume diminuído para: " + volume);
        } else {
            System.out.println("Volume já está no mínimo.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal trocado para: " + canal);
        } else {
            System.out.println("Canal inválido.");
        }
    }
}

