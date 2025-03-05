package atividades;

import java.util.Scanner;

public class aula3atv2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.println("Digite seu turno. M para manha, T para tarde e a N para noite");
        String turno = teclado.nextLine().toUpperCase();

        String saudacao;

        if (turno.equals("M")) {
            saudacao = "Bom dia, " + nome + "! Tenha um excelente dia de estudos!";
        } else if (turno.equals("T")) {
            saudacao = "Boa tarde, " + nome + "! Aproveite seu turno de estudos!";
        } else if (turno.equals("N")) {
            saudacao = "Boa noite, " + nome + "! Desejamos uma produtiva noite de estudos!";
        } else {
            saudacao = "Olá, " + nome + "! Turno não reconhecido. Por favor, use M, T ou N.";
        }

        // Exibir a saudação personalizada
        System.out.println(saudacao);

        // Fechar o scanner
        teclado.close();
    }
}
