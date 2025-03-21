package atividades.foreach;

public class atv12 {

    public static void main(String[] args) {
        int[] numeros = {23, 45, 12, 8, 92, 37, 16};

        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O menor número no array é: " + menor);
    }
}
