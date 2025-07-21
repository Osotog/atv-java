/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos;

/**
 *
 * @author contr
 */
public class ex_9 {
    
    public static void main(String[] args) {
        
        produto_ex9 p = new produto_ex9();
        p.nome = "Notebook";
        p.preco = 3500.0;
        p.quantidadeEmEstoque = 10;
        
        
        System.out.println("Produto: " + p.nome);
        System.out.println("Preço: R$ " + p.preco);
        System.out.println("Estoque inicial: " + p.quantidadeEmEstoque);
        
        
        p.vender(3);
        System.out.println("Estoque após venda: " + p.quantidadeEmEstoque);
        
        
        p.reporEstoque(5);
        System.out.println("Estoque após reposição: " + p.quantidadeEmEstoque);
        
        
        p.vender(15);
    }
    
}
