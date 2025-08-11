import javax.swing.*;
import java.awt.*;


public class ex01 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercício 01");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel();
        
        painelPrincipal.setBackground(Color.GREEN);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));

        JButton botao = new JButton("Clique Aqui");
        botao.setBackground(Color.YELLOW);
        botao.setForeground(Color.WHITE);


    }
}
