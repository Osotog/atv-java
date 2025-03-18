package arraylists;

import java.util.ArrayList;

public class atv4 {

    public static void main(String[] args) {

        ArrayList<String> cores = new ArrayList<>();
        cores.add("vermelho");
        cores.add("verde");
        cores.add("azul");
        cores.add("amarelo");
        boolean contemamarelo = cores.contains("amarelo");
        System.out.println("a lista contem amarelo? "+contemamarelo);


    }
}
