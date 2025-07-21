/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_contasBancarias;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("123-0", 1000.00, 500.00);
        ContaPoupanca cp = new ContaPoupanca("456-0", 1500.00, 0.02);
        ContaInvestimento ci = new ContaInvestimento("789-0", 5000.00, "Renda Fixa");

        System.out.println(cc.exibirDados());
        cc.sacar(1300);
        System.out.println("Após saque: " + cc.exibirDados());

        System.out.println(cp.exibirDados());
        cp.aplicarJuros();
        System.out.println("Após aplicar juros: " + cp.exibirDados());

        System.out.println(ci.exibirDados());
    }
}

