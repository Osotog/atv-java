package admin;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminMenu extends JFrame {

    private JTable tabelaUsuarios;
    private DefaultTableModel modelo;
    private JButton btnAtualizar, btnExcluir, btnEditar;
    private final String DB_URL = "jdbc:mysql://localhost:3306/calculadora";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "root";

    public AdminMenu() {
        setTitle("Painel Administrativo");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        modelo = new DefaultTableModel(new Object[]{"ID", "Usuário", "Senha"}, 0);
        tabelaUsuarios = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tabelaUsuarios);
        add(scrollPane, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel();

        btnAtualizar = new JButton("Atualizar Lista");
        btnExcluir = new JButton("Excluir Usuário");
        btnEditar = new JButton("Editar Usuário");

        painelBotoes.add(btnAtualizar);
        painelBotoes.add(btnEditar);
        painelBotoes.add(btnExcluir);
        add(painelBotoes, BorderLayout.SOUTH);

        carregarUsuarios();

        btnAtualizar.addActionListener(e -> carregarUsuarios());

        btnExcluir.addActionListener(e -> excluirUsuario());

        btnEditar.addActionListener(e -> editarUsuario());
    }

    private void carregarUsuarios() {
        modelo.setRowCount(0); // limpa tabela

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")) {

            while (rs.next()) {
                modelo.addRow(new Object[]{
                        rs.getInt("id"),
                        rs.getString("nome_usuario"),
                        rs.getString("senha")
                });
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao carregar usuários.");
        }
    }

    private void excluirUsuario() {
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para excluir.");
            return;
        }

        int id = (int) modelo.getValueAt(linhaSelecionada, 0);

        int confirmacao = JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir o usuário?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION
        );

        if (confirmacao == JOptionPane.YES_OPTION) {
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE id = ?")) {

                stmt.setInt(1, id);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Usuário excluído com sucesso.");
                carregarUsuarios();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao excluir usuário.");
            }
        }
    }

    private void editarUsuario() {
        int linhaSelecionada = tabelaUsuarios.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um usuário para editar.");
            return;
        }

        int id = (int) modelo.getValueAt(linhaSelecionada, 0);
        String nomeAtual = (String) modelo.getValueAt(linhaSelecionada, 1);
        String senhaAtual = (String) modelo.getValueAt(linhaSelecionada, 2);

        String novoNome = JOptionPane.showInputDialog(this, "Novo nome de usuário:", nomeAtual);
        String novaSenha = JOptionPane.showInputDialog(this, "Nova senha:", senhaAtual);

        if (novoNome != null && novaSenha != null) {
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(
                         "UPDATE usuarios SET nome_usuario = ?, senha = ? WHERE id = ?")) {

                stmt.setString(1, novoNome);
                stmt.setString(2, novaSenha);
                stmt.setInt(3, id);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Usuário atualizado com sucesso.");
                carregarUsuarios();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Erro ao atualizar usuário.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AdminMenu().setVisible(true);
        });
    }
}
