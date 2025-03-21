package foreach;

public class atv8 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Array original:");
        imprimirArray(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            // Verifica se o número é ímpar
            if (numeros[i] % 2 != 0) {
                numeros[i] = 0;
            }
        }
        
        System.out.println("\nArray após substituir ímpares por zero:");
        imprimirArray(numeros);
    }
    
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
