package arraylists;

import java.util.ArrayList;

public class atv2 {

     public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);

        numeros.removeIf(n -> n % 2 == 0);

        for (int num : numeros) {
            System.out.println(num);
        }
    }
}

