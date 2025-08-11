import javax.swing.*;
import java.awt.*;

public class ex02 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercício 02");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();

        JPanel painel1 = new JPanel();
        JLabel labelConfiguracoes = new JLabel("Bem vindo às configurações!");
        painel1.setBackground(Color.BLUE);
        labelConfiguracoes.setForeground(Color.WHITE);
        painel1.add(labelConfiguracoes);
        tabbedPane.addTab("Configurações", painel1);

        JPanel painel2 = new JPanel();
        JLabel labelNome = new JLabel("Nome");
        JTextField campoNome = new JTextField();
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.Y_AXIS));
        painel2.setBackground(Color.BLUE);
        labelNome.setForeground(Color.WHITE);
        painel2.add(labelNome);
        painel2.add(campoNome);
        tabbedPane.addTab("Perfil", painel2);

        JPanel painel3 = new JPanel();
        JLabel labelAjuda = new JLabel("Digite suas dúvidas aqui:");
        JTextArea campoDuvidas = new JTextArea();
        painel3.setBackground(Color.BLUE);
        labelAjuda.setForeground(Color.WHITE);
        painel3.add(labelAjuda);
        painel3.add(campoDuvidas);
        tabbedPane.addTab("Ajuda", painel3);
        
        frame.add(tabbedPane);
        frame.setVisible(true);



    }
}
