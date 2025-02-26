package exemplosjava;

import java.util.Scanner;

public class atv4 {

    public static void main(String[] args) {

        double distancia;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite os metros:");
        distancia = teclado.nextDouble();

        System.out.println("para centimetros:"+(distancia*100)+"para km"+(distancia/1000));

    }

}
