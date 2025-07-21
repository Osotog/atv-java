/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_ContasdeUsuario;

/**
 *
 * @author contr
 */
public class Administrador implements ContaUsuario {
    private String nome;

    public Administrador(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Administrador " + nome + " acessou o sistema.");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Administrador " + nome + " realizou uma operação administrativa.");
    }
}

