package arraylists;

import java.util.ArrayList;

public class atv6 {

    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Abacaxi");

        System.out.println("Lista original de frutas: " + frutas);

        frutas.set(2, "Morango");

        System.out.println("Lista após substituição: " + frutas);
    }
}
