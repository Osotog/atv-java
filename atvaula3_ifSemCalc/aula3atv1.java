package aula3;

import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome;
        nome = teclado.next();
        if (nome.length() > 5) {
            System.out.println("nome valido");
        } else {
            System.out.println("nome invalido");

        }
    }
}
