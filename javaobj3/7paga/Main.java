/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_FormasdePagamento;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        FormaPagamento cartao = new CartaoCredito("1234-5678-9876-5432");
        FormaPagamento boleto = new Boleto("23791.11101 12345.678904 12345.678900 1 12345678900000");
        FormaPagamento dinheiro = new Dinheiro();

        cartao.efetuarPagamento(200.0);
        boleto.efetuarPagamento(150.0);
        dinheiro.efetuarPagamento(50.0);
    }
}

