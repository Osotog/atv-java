/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4_PessoacomInterface;

/**
 *
 * @author contr
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 30));
        pessoas.add(new Pessoa("Bruno", 25));
        pessoas.add(new Pessoa("Carlos", 40));

        Collections.sort(pessoas);

        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa p : pessoas) {
            System.out.println(p);
        }
    }
}

