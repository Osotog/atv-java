/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class produto_ex9 {
    
    String nome;
    double preco;
    int quantidadeEmEstoque;
    
    
    void vender(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para venda.");
            return;
        }
        
        if (quantidade > quantidadeEmEstoque) {
            System.out.println("Estoque insuficiente. Disponível: " + quantidadeEmEstoque);
            return;
        }
        
        quantidadeEmEstoque -= quantidade;
        System.out.println(quantidade + " unidades de " + nome + " vendidas.");
    }
    
    
    void reporEstoque(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Quantidade inválida para reposição.");
            return;
        }
        
        quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
    }
    
}
