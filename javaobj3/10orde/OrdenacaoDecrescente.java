/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_Ordenacao;

/**
 *
 * @author contr
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoDecrescente<T extends Comparable<T>> implements Ordenacao<T> {
    @Override
    public void ordenar(List<T> lista) {
        Collections.sort(lista, Comparator.reverseOrder());
        System.out.println("Lista ordenada em ordem decrescente.");
    }
}

