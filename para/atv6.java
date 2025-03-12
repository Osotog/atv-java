package atividades.para;

import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.print("Resultado: ");
        for (int i = 1; i <= numero; i++) {
            System.out.print(caractere);
        }

        scanner.close();
    }
}
