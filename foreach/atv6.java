package atividades.foreach;

public class atv6 {

    public class ContarMaioresQueDez {

        public static void main(String[] args) {
            int[] numeros = {5, 12, 8, 21, 10, 15, 7, 3, 18, 9, 14, 6};

            int contador = 0;

            for (int numero : numeros) {
                if (numero > 10) {
                    contador++;
                }
            }

            System.out.print("Array de números: [");
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i]);
                if (i < numeros.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");

            System.out.println("Quantidade de elementos maiores que 10: " + contador);

            System.out.print("Elementos maiores que 10: [");
            boolean primeiro = true;
            for (int numero : numeros) {
                if (numero > 10) {
                    if (!primeiro) {
                        System.out.print(", ");
                    }
                    System.out.print(numero);
                    primeiro = false;
                }
            }
            System.out.println("]");
        }
    }
}
