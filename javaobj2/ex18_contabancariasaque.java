/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_objetos_aula2;

/**
 *
 * @author contr
 */
public class ex18_contabancariasaque {
    
    private String titular;
    private double saldo;

    
    public ex18_contabancariasaque(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false; 
        }
    }

    
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}

