/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex12_porta {
    
    private boolean aberta;
    private String cor;

    
    public ex12_porta(boolean aberta, String cor) {
        this.aberta = aberta;
        this.cor = cor;
    }

    
    public boolean isAberta() {
        return aberta;
    }

    public String getCor() {
        return cor;
    }

    
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    
    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A porta foi aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A porta foi fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }
}

