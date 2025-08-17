import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex02 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercício 02");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        // painel 1
        JPanel painel1 = new JPanel();
        JLabel labelConfiguracoes = new JLabel("Bem vindo às configurações!");
        

        // painel 2
        JPanel painel2 = new JPanel();
        JLabel labelNome = new JLabel("Nome");
        JTextField campoNome = new JTextField(10);
        JButton botaoNome = new JButton("Enviar"); // criando o botão
        // evento para quando o botão for clicado, aparecer o nome inserido na tela
        botaoNome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(frame, "Nome: " + campoNome.getText()); // exibe o nome
            }
        });


        // painel 3
        JPanel painel3 = new JPanel();
        JLabel labelAjuda = new JLabel("Digite suas dúvidas aqui:");
        JTextArea campoDuvidas = new JTextArea(5,10);
        JButton botaoAjuda = new JButton("Enviar"); // criando o botão

        // evento para quando o botão for clicado, aparecer o nome inserido na tela
        botaoAjuda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(frame, "Dúvidas: " + campoDuvidas.getText()); // exibe o que foi digitado
            }
        });
        


        // estilização
        //painel 1
        painel1.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        painel1.setBackground(Color.BLUE);
        labelConfiguracoes.setForeground(Color.WHITE);

        //painel 2
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));
        painel2.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        painel2.setBackground(Color.BLUE);
        labelNome.setForeground(Color.WHITE);

        //painel 3
        painel3.setLayout(new BoxLayout(painel3, BoxLayout.Y_AXIS));
        painel3.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        painel3.setBackground(Color.BLUE);
        labelAjuda.setForeground(Color.WHITE);



        // adicionando os componentes
        painel1.add(labelConfiguracoes);
        tabbedPane.addTab("Configurações", painel1);

        painel2.add(labelNome);
        painel2.add(Box.createVerticalStrut(20)); // espaçamento
        painel2.add(campoNome);
        painel2.add(Box.createVerticalStrut(20)); // espaçamento
        painel2.add(botaoNome);
        tabbedPane.addTab("Perfil", painel2);

        painel3.add(labelAjuda);
        painel3.add(Box.createVerticalStrut(20)); // espaçamento
        painel3.add(campoDuvidas);
        painel3.add(Box.createVerticalStrut(20)); // espaçamento
        painel3.add(botaoAjuda);
        tabbedPane.addTab("Ajuda", painel3);

        frame.add(tabbedPane);


        frame.setVisible(true);

    }
}
