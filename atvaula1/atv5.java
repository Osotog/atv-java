package exemplosjava;

import java.util.Scanner;

public class atv5 {

    public static void main(String[] args) {
        double reais = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o valor em reais");
        reais = teclado.nextDouble();

        System.out.println("essa é a coinversao"+(reais*5.45));
    }

}
