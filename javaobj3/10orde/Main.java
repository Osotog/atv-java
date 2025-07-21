/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_Ordenacao;

/**
 *
 * @author contr
 */
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 2, 9, 1, 7);
        List<String> nomes = Arrays.asList("Lucas", "Ana", "Bruno", "Carlos");

        Ordenacao<Integer> crescente = new OrdenacaoCrescente<>();
        Ordenacao<Integer> decrescente = new OrdenacaoDecrescente<>();

        crescente.ordenar(numeros);
        System.out.println(numeros);

        decrescente.ordenar(numeros);
        System.out.println(numeros);

        Ordenacao<String> ordStrCresc = new OrdenacaoCrescente<>();
        ordStrCresc.ordenar(nomes);
        System.out.println(nomes);
    }
}

