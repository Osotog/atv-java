package exemplosjava;

import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double dias;

        System.out.println("quantos dias ele trabalhou?:");
        dias = teclado.nextDouble();

        System.out.println("o salario dele sera"+(dias*8*25));

    }

}
