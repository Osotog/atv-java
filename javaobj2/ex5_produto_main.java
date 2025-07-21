/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex5_produto_main {
    
    
    public static void main(String[] args) {
        ex5_produto produto = new ex5_produto("Notebook", 3500.00, 10);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Estoque: " + produto.getQuantidadeEmEstoque());

        produto.comprar(3);  
        System.out.println("Estoque após compra: " + produto.getQuantidadeEmEstoque());

        produto.comprar(8);  
    }


    
}
