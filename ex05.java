import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex05 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exercício 05");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelPrincipal = new JPanel(); // criando painel principal

        // criando o label e os radio buttons para selecionar o gênero
        JLabel labelGenero = new JLabel("Gênero");
        JRadioButton sexoMasculino = new JRadioButton("Masculino");
        JRadioButton sexoFeminino = new JRadioButton("Feminino");
        JRadioButton sexoOutro = new JRadioButton("Outro");
         // agrupa os radio buttons para somente um poder ser selecionado
        ButtonGroup grupoGenero = new ButtonGroup();

        JPanel painelBotoes = new JPanel();

        JLabel labelOpcaoSelecionada = new JLabel("Gênero selecionado: ");
        
        JButton botaoExibir = new JButton("Exibir"); // criando botão para exibir o gênero selecionado
        // evento para quando clicar no botão
        botaoExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // altera a label com base na opção selecionada
                if (sexoMasculino.isSelected()){
                    labelOpcaoSelecionada.setText("Gênero selecionado: Masculino.");
                } 
                else if (sexoFeminino.isSelected()){
                    labelOpcaoSelecionada.setText("Gênero selecionado: Feminino.");
                } 
                else if (sexoOutro.isSelected()){
                    labelOpcaoSelecionada.setText("Gênero selecionado: Outro.");
                } 
                else{
                    JOptionPane.showMessageDialog(frame, "Selecione uma opção.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton botaoLimpar = new JButton("Limpar"); // botão para limpar o que foi selecionado
        // evento para quando clicar no botão
        botaoLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evento){
                // limpa o que estava digitado/selecionado
                grupoGenero.clearSelection();
                labelOpcaoSelecionada.setText("Gênero selecionado: ");
            }
        });

        //estilização

        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        painelPrincipal.setBackground(new Color(45, 45, 45));

        sexoMasculino.setBackground(new Color(45, 45, 45));
        sexoFeminino.setBackground(new Color(45, 45, 45));
        sexoOutro.setBackground(new Color(45, 45, 45));
        sexoMasculino.setForeground(Color.WHITE);
        sexoFeminino.setForeground(Color.WHITE);
        sexoOutro.setForeground(Color.WHITE);

        labelGenero.setForeground(Color.WHITE);
        labelOpcaoSelecionada.setForeground(Color.WHITE);

        painelBotoes.setBackground(new Color(45, 45, 45));
        botaoExibir.setBackground(Color.GREEN);
        botaoExibir.setForeground(Color.BLACK);
        botaoLimpar.setBackground(Color.WHITE);
        botaoExibir.setForeground(Color.BLACK);


        // adicionando componentes

        painelPrincipal.add(labelGenero);
        grupoGenero.add(sexoMasculino);
        grupoGenero.add(sexoFeminino);
        grupoGenero.add(sexoOutro);

        painelPrincipal.add(sexoMasculino);
        painelPrincipal.add(sexoFeminino);
        painelPrincipal.add(sexoOutro);
        painelPrincipal.add(Box.createVerticalStrut(20)); // espaçamento
        painelPrincipal.add(labelOpcaoSelecionada);
        painelPrincipal.add(Box.createVerticalStrut(20)); // espaçamento

        painelBotoes.add(botaoExibir);
        painelBotoes.add(botaoLimpar);
        painelPrincipal.add(painelBotoes);

        frame.add(painelPrincipal);

        frame.setVisible(true);
    }
}
