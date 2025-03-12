package atividades.se;

import java.util.Scanner;

public class aula3atv5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um dia da semana (em minúsculas): ");

        String dia = teclado.nextLine().toLowerCase();

        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta")
                || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println("Dia útil");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Fim de semana");
        } else {
            System.out.println("Dia inválido");
        }

        teclado.close();
    }
}
