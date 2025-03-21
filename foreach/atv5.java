package atividades.foreach;

import java.util.HashSet;

public class atv5 {

    public static void main(String[] args) {
        HashSet<String> conjuntoNomes = new HashSet<>();

        conjuntoNomes.add("Carlos");
        conjuntoNomes.add("Maria");
        conjuntoNomes.add("Ana");
        conjuntoNomes.add("João");
        conjuntoNomes.add("Pedro");

        conjuntoNomes.add("Maria");

        System.out.println("O HashSet contém " + conjuntoNomes.size() + " elementos.");

        System.out.println("\nElementos do HashSet (usando toString):");
        System.out.println(conjuntoNomes);

        System.out.println("\nElementos do HashSet (usando forEach):");
        conjuntoNomes.forEach(nome -> System.out.println("- " + nome));

        System.out.println("\nElementos do HashSet (usando enhanced for loop):");
        for (String nome : conjuntoNomes) {
            System.out.println("* " + nome);
        }

        String nomeBusca = "Ana";
        if (conjuntoNomes.contains(nomeBusca)) {
            System.out.println("\nO nome '" + nomeBusca + "' está presente no conjunto.");
        } else {
            System.out.println("\nO nome '" + nomeBusca + "' não está presente no conjunto.");
        }

    }
}
