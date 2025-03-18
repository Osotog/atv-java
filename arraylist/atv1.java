package arraylists;

import java.util.ArrayList;

public class atv1 {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Tramandai");
        cidades.add("Pindamonhangaba");
        cidades.add("Bertioga");
        cidades.add("Tangamandapio");
        cidades.add("Bombinhas");

        for (String nome : cidades) {
            System.out.println(nome);
        }
    }
}
