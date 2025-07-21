/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex5_produto {
    
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    
    public ex5_produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    public void comprar(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Compra realizada. " + quantidade + " unidades compradas.");
        } else {
            System.out.println("Quantidade indisponível em estoque.");
        }
    }
}

