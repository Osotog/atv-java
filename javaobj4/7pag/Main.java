/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_pagamentos;

/**
 *
 * @author contr
 */

public class Main {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[3];

        pagamentos[0] = new PagamentoCartao();
        pagamentos[1] = new PagamentoBoleto();
        pagamentos[2] = new PagamentoPix();

        double[] valores = {150.0, 89.9, 320.75};

        System.out.println(" Iniciando processamento de pagamentos:\n");

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].processarPagamento(valores[i]);
        }
    }
}

