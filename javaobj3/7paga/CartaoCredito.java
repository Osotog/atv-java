/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_FormasdePagamento;

/**
 *
 * @author contr
 */
public class CartaoCredito implements FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado com cartão de crédito: " + numeroCartao);
    }
}

