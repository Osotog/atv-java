/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex9_funcionario {
    
    private String nome;
    private double salario;
    private String departamento;

    
    public ex9_funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            salario += salario * (percentual / 100);
            System.out.println("Salário aumentado em " + percentual + "%.");
        } else {
            System.out.println("Percentual inválido para aumento.");
        }
    }
}

