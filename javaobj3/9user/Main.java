/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_ContasdeUsuario;

/**
 *
 * @author contr
 */
public class Main {
    public static void main(String[] args) {
        ContaUsuario admin = new Administrador("Alice");
        ContaUsuario usuario = new UsuarioComum("Bob");

        admin.acessarSistema();
        admin.realizarOperacao();

        usuario.acessarSistema();
        usuario.realizarOperacao();
    }
}

