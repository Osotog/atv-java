package exemplosjava;

import java.util.Scanner;

public class atv6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int largura;
        int comprimento;

        System.out.println("digite a largura: ");
        largura = teclado.nextInt();

        
        System.out.println("digite a altura: ");
        comprimento = teclado.nextInt();

        System.out.println("a quantidade de tinta necessaria é: "+(comprimento*largura)+"L");
    }

}
