package atividades.foreach;

public class atv13 {

    public static void main(String[] args) {
        int[] numeros = {23, 45, 12, 8, 92, 37, 16, 10, 55};

        int contadorPares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares no array: " + contadorPares);
    }
}
