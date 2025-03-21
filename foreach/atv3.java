package atividades.foreach;

public class atv3 {

    public static void main(String[] args) {
        int[] numeros = {10, 5, 25, 8, 14, 3, 22, 18};

        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior número no array é: " + maior);
    }
}
