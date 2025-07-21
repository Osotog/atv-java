/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_FuncionariocomInterface;

/**
 *
 * @author contr
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagavel> funcionarios = new ArrayList<>();
        funcionarios.add(new FuncionarioHorista("Lucas", 50.0, 160)); // 50 x 160
        funcionarios.add(new FuncionarioAssalariado("Maria", 5000.0));

        for (Pagavel p : funcionarios) {
            if (p instanceof FuncionarioHorista) {
                FuncionarioHorista fh = (FuncionarioHorista) p;
                System.out.println("Pagamento para " + fh.getNome() + ": R$" + fh.calcularPagamento());
            } else if (p instanceof FuncionarioAssalariado) {
                FuncionarioAssalariado fa = (FuncionarioAssalariado) p;
                System.out.println("Pagamento para " + fa.getNome() + ": R$" + fa.calcularPagamento());
            }
        }
    }
}

