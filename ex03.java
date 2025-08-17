import javax.swing.*;
import java.awt.*;

public class ex03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 03");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        // caixa de texto
        JTextArea caixaDeTexto = new JTextArea(10, 30);
        caixaDeTexto.setText("Java Swing é usado para criar interfaces gráficas em Java. Ele fornece uma coleção de componentes como botões, caixas de texto, áreas de texto, tabelas e muito mais, permitindo o desenvolvimento de aplicações desktop robustas e interativas.");

        // barra de rolagem
        JScrollPane scrollPane = new JScrollPane(caixaDeTexto);

        // estilização da text area
        caixaDeTexto.setBackground(Color.LIGHT_GRAY);
        caixaDeTexto.setForeground(Color.BLACK);
        caixaDeTexto.setFont(new Font("Arial", Font.BOLD, 12));

        // adicionando o scroll pane ao frame
        frame.add(scrollPane);

        frame.setVisible(true); // tornando o frame visível

        // EXPLICAÇÃO: Nesse exercício, o scroll pane é necessário para que o usuário consiga ler todo o texto que foi automaticamente inserido na textArea. 
        // Como o textArea não possui uma barra de rolagem própria, se não fosse inserido o JScrollPane, o usuário só conseguiria ler o que está no espaço definido da caixa de texto.
    }
}
