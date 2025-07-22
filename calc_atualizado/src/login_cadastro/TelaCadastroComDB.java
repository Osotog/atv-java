package login_cadastro;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TelaCadastroComDB extends JFrame {

    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoCadastrar;

    private final String DB_URL = "jdbc:mysql://localhost:3306/calculadora";
    private final String DB_USER = "root"; 
    private final String DB_PASSWORD = "root"; 
    
    public TelaCadastroComDB() {
        setTitle("Tela de Cadastro com Banco de Dados");
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

        botaoCadastrar = new JButton("Cadastrar");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(botaoCadastrar, gbc);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                
                if(e.getSource()==botaoCadastrar) {
                    dispose();
                    TelaLogin tl= new TelaLogin();
                    tl.setLocationRelativeTo(tl);
                    tl.setVisible(true);
                            
                }

                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(
                            TelaCadastroComDB.this,
                            "Preencha todos os campos!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }

                if (cadastrarUsuario(usuario, senha)) {
                    JOptionPane.showMessageDialog(
                            TelaCadastroComDB.this,
                            "Usuário cadastrado com sucesso!",
                            "Sucesso",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    campoUsuario.setText("");
                    campoSenha.setText("");
                } else {
                    JOptionPane.showMessageDialog(
                            TelaCadastroComDB.this,
                            "Erro ao cadastrar usuário.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }
            }
        });
    }

    private boolean cadastrarUsuario(String usuario, String senha) {
        String sql = "INSERT INTO usuarios (nome_usuario, senha) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, senha); 

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaCadastroComDB().setVisible(true);
        });
    }
}
