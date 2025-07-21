/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex2_contabancaria {
    
    private String numeroConta;
    private double saldo;
    private String titular;

    
    public ex2_contabancaria(String numeroConta, double saldo, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    
    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }
}
