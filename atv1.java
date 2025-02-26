package exemplosjava;

import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        //String mensagem = "ola, mundo";
        //String nome = "octavio";
        //System.out.println("Muito prazer em te conhecer, "+nome);

        String nome;
        int salario;

        Scanner teclado = new Scanner(System.in);

        System.out.println("digite seu nome");
        nome = teclado.nextLine();//leia
        System.out.println("informe seu salario");
        salario = teclado.nextInt(); //escreval

        System.out.println("muito prazer," + nome + "\n seu salario é:  " + "R$"+salario);
    }
}
