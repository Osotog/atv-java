/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_dispositivosEletronicos;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        Smartphone celular = new Smartphone("Samsung", "Galaxy S22", 6.1);
        Tablet tablet = new Tablet("Apple", "iPad Air", 10.9);
        Notebook notebook = new Notebook("Dell", "XPS 13", 512);

        System.out.println(celular.exibirDados());
        System.out.println(tablet.exibirDados());
        System.out.println(notebook.exibirDados());
    }
}

