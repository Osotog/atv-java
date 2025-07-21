/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex7_FormasdePagamento;

/**
 *
 * @author contr
 */
public class Boleto implements FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void efetuarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado via boleto com código: " + codigoBarras);
    }
}

