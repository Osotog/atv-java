package atividades.se;

import java.util.Scanner;

public class aula3atv4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um login: ");

        String login = teclado.nextLine();

        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("Login válido");
        } else {
            System.out.println("Login inválido");
        }

        teclado.close();
    }
}
