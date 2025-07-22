package login_cadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TelaLogin extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoEntrar;

    private final String DB_URL = "jdbc:mysql://localhost:3306/calculadora";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "root";

    public TelaLogin() {
        setTitle("Tela de Login");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Usuário:"), gbc);

        campoUsuario = new JTextField(15);
        gbc.gridx = 1;
        add(campoUsuario, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Senha:"), gbc);

        campoSenha = new JPasswordField(15);
        gbc.gridx = 1;
        add(campoSenha, gbc);

        botaoEntrar = new JButton("Entrar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(botaoEntrar, gbc);

        botaoEntrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            TelaLogin.this,
                            "Preencha todos os campos!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (verificarLogin(usuario, senha)) {
                    JOptionPane.showMessageDialog(
                            TelaLogin.this,
                            "Login bem-sucedido!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    dispose();
                    SwingUtilities.invokeLater(() -> {
                        new calc.Calculator().setVisible(true);
                    });
                    if (usuario.equalsIgnoreCase("admin")) {
                        dispose();
                        SwingUtilities.invokeLater(() -> {
                            new admin.AdminMenu().setVisible(true);
                        });
                    } else {
                        dispose();
                        SwingUtilities.invokeLater(() -> {
                            new calc.Calculator().setVisible(true);
                        });
                    }

                } else {
                    JOptionPane.showMessageDialog(
                            TelaLogin.this,
                            "Usuário ou senha inválidos.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    private boolean verificarLogin(String usuario, String senha) {
        String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha = ?";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
    }
}
