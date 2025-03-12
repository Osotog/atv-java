package atividades.se;

import java.util.Scanner;

public class atv11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int speed;

        System.out.println("qual foi sua velocidade?: ");

        speed = teclado.nextInt();

        if (speed > 80) {
            double multa = (speed - 80) * 5;
            System.out.println("acima do limite permitido! Sua multa eh de:" + multa);
            multa = teclado.nextDouble();

        } else {
            System.out.println("nao foi multado!");
        }
    }

}
