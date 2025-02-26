package exemplosjava;

import java.util.Scanner;

public class atv8 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double valor;
       

      System.out.println("digite o preço");
        valor = teclado.nextDouble();
         double resultado=(valor)-(valor*0.05);
        System.out.println("esse é o valor do desconto: "+(valor*0.05));
        System.out.println("esse é o valor final"+resultado);


    }

}
