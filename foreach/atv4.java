package atividades.foreach;

public class atv4 {

    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.3, 6.5, 8.0, 7.8, 9.0};

        double soma = 0.0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.printf("A média das notas é: \n", media);
    }
}
