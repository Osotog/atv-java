package exemplosjava;

import java.util.Scanner;

public class atv9 {

public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double dias;
    double km;
    double kmresultado;

    System.out.println("quantos dias voce pretende alugar o carro?");
    dias = teclado.nextDouble();
    System.out.println("o valor fica:"+dias*90+" reais");

    
    System.out.println("quantos km voce andou?");
    km = teclado.nextDouble();
    System.out.println(" o valor fica:"+km*0.20+" reais");

    double resultado=(km*0.20)+(dias*90);

    System.out.println("o valor total fica:R$"+resultado);
}

}
