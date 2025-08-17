import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ex07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exercício 07");
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painelPrincipal = new JPanel();

        JComboBox<String> comboBox = new JComboBox<>(); // criando o combo box
        // adicionando as opções
        comboBox.addItem("Argentina");
        comboBox.addItem("Brasil");
        comboBox.addItem("Chile");
        comboBox.setSelectedItem("Argentina"); // definindo o item selecionado automaticamente
        JLabel label = new JLabel("País selecionado: " + comboBox.getSelectedItem());

        // evento para quando uma opção for selecionada
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evento) {
                if (evento.getStateChange() == ItemEvent.SELECTED){
                    label.setText("País selecionado: "+ evento.getItem()); // mostra o país selecionado
                }
            }
        });

        // estilização
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBackground(Color.BLACK);
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        label.setForeground(Color.WHITE);
        comboBox.setBackground(Color.WHITE);

        // adicionando os componentes
        painelPrincipal.add(comboBox);
        painelPrincipal.add(Box.createVerticalStrut(20)); // espaçamento
        painelPrincipal.add(label);
        frame.add(painelPrincipal);

        frame.setVisible(true);
    }
}
