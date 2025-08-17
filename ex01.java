import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ex01 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercício 01");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel(); // criação do painel principal
        painelPrincipal.setBorder(BorderFactory.createTitledBorder("Painel de Controle")); // criação da borda com título

        JButton botao = new JButton("Clique Aqui"); // criação do botao
        // evento para quando o botão for clicado, aparecer uma mensagem na tela
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(frame, "O botão foi clicado."); // exibe a mensagem
            }
        });

        
        // estilização
        painelPrincipal.setBackground(Color.GREEN); // estilizando a cor de fundo do painel
        painelPrincipal.setFont(new Font("Arial", Font.BOLD, 16)); // estilizando a fonte do painel
        botao.setBackground(Color.YELLOW); // estilizando a cor de fundo do botao
        botao.setFont(new Font("Arial", Font.BOLD, 16)); // estilizando a fonte do botao

        // adicionando componentes
        painelPrincipal.add(botao);
        frame.add(painelPrincipal);

        frame.setVisible(true); // torna o frame visível


    }
}
