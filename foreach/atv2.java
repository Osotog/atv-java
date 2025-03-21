package atividades.foreach;

import java.util.Arrays;
import java.util.List;

public class atv2 {

    public static void main(String[] args) {
        List<String> listaDeStrings = Arrays.asList("java", "python", "c++", "javascript", "ruby");

        for (String texto : listaDeStrings) {
            System.out.println(texto.toUpperCase());
        }
    }
}
