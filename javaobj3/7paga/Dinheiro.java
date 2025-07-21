/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_FormasdePagamento;

/**
 *
 * @author contr
 */
public class Dinheiro implements FormaPagamento {
    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado em dinheiro.");
    }
}

