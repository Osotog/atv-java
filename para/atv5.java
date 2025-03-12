package atividades.para;

import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double soma = 0;
        int quantidade = 5;

        System.out.println("Digite 5 números para calcular a média:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = teclado.nextDouble();
            soma += numero;
        }

        double media = soma / quantidade;

        System.out.println("A média dos números é: " + media);

        teclado.close();
    }
}
