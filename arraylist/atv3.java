package arraylists;

import java.util.ArrayList;

public class atv3 {

    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add((double) 1.1);
        numeros.add((double) 2.2);
        numeros.add((double) 3.3);
        numeros.add((double) 4.4);
        numeros.add((double) 5.5);
        Double num = numeros.get(2);

        System.out.println(numeros);
        System.out.println("");
        System.out.println(num);

    }

}
