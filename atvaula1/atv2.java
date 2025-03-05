package exemplosjava;

import java.util.Scanner;

public class atv2 {
    public static void main(String[] args) {
        int numero;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o numero");
        numero = teclado.nextInt();
        System.out.println("o numero que voce selecionaou foi:" + numero);
        System.out.println("numero antecessor " + (numero-1) + " e o sucessor " + (numero+1));
    }

}
