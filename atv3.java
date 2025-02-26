package exemplosjava;

import java.util.Scanner;

public class atv3 {

    public static void main(String[] args) {

        Double numero;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o numero:");
        numero = teclado.nextDouble();

        System.out.println("o dobro é:" + (numero * 2)+"e o terço é:"+(numero / 3));

        

    }

}
