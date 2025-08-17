import javax.swing.*;
import java.awt.*;

public class ex06  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 06");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelEsquerdo = new JPanel();
        JLabel labelEsquerda = new JLabel("Esquerda");

        JPanel painelDireito = new JPanel();
        JLabel labelDireita = new JLabel("Direita");

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, painelEsquerdo, painelDireito); // cria o split pane

        splitPane.setDividerLocation(0.4); // define a posição da divisória como 40% da largura da janela
        splitPane.setDividerSize(10); // define o tamanho do divisor

        // estilização
        painelEsquerdo.setBackground(Color.RED);
        labelEsquerda.setForeground(Color.WHITE);
        painelDireito.setBackground(Color.BLUE);
        labelDireita.setForeground(Color.WHITE);

        // adicionando componentes
        painelEsquerdo.add(labelEsquerda);
        painelDireito.add(labelDireita);
        frame.add(splitPane);

        frame.setVisible(true);
    }

}
// EXPLICAÇÃO DO SetDividerLocation: O método SetDividerLocation tem a função de definir a posição da divisória que dividirá painéis em uma tela. Para deifinir
// a posição da divisória, pode-se passar um valor em pixels ou um valor em porcentagem de 0 a 1 (o que permite que a divisão se reajuste automaticamente quando o tamanho da tela se modifica).
