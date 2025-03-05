package atividades;

import java.util.Scanner;

public class aula3atv3 {

    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Solicitando que o usuário digite uma palavra
        System.out.print("Digite uma palavra: ");

        // Lendo a palavra digitada
        String palavra = teclado.nextLine();

        // Invertendo a palavra
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        // Exibindo a palavra invertida
        System.out.println("Palavra invertida: " + palavraInvertida);

        // Fechando o scanner
        teclado.close();
    }
}
