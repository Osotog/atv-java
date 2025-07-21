/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex4_livro {
    
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    
    public ex4_livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro emprestado com sucesso.");
        } else {
            System.out.println("O livro já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso.");
        } else {
            System.out.println("O livro já está disponível.");
        }
    }
}

