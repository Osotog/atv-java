/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex8_aluno {
    
    private String nome;
    private String matricula;
    private double[] notas;

    
    public ex8_aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    
    public double calcularMedia() {
        if (notas == null || notas.length == 0) {
            return 0.0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

