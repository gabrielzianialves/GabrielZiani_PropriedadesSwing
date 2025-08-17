import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;

public class ex04 {
    public ex04() throws Exception {

        JFrame frame = new JFrame("Exercício 04");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 190);
        
        JPanel painelPrincipal = new JPanel(); // criando o panel principal

        JLabel label = new JLabel("Data de Nascimento:"); // criando a label de data de nascimento

        // criando a mascara de formatação
        MaskFormatter mascara = new MaskFormatter("##/##/####");
        mascara.setPlaceholderCharacter('_');

        //criando o campo para inserir a data
        JFormattedTextField campoData = new JFormattedTextField(mascara);
        campoData.setColumns(10);

        JButton botao = new JButton("Enviar"); // criando o botão

        // evento para quando o botão for clicado, aparecer a data inserida na tela
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evento){
                JOptionPane.showMessageDialog(frame, "Data de Nascimento: " + campoData.getText()); // exibe a data
            }
        });


        // estilização
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 25, 20, 25));
        painelPrincipal.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 12));
        botao.setBackground(Color.GREEN);
        botao.setForeground(Color.BLACK);


        // adicionando os componentes
        painelPrincipal.add(label);
        painelPrincipal.add(Box.createVerticalStrut(20)); // espaçamento
        painelPrincipal.add(campoData);
        painelPrincipal.add(Box.createVerticalStrut(20)); // espaçamento
        painelPrincipal.add(botao);
        frame.add(painelPrincipal);

        frame.setVisible(true);

    }

    // tratamento de erros
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try{
                new ex04();
            } 
            catch (Exception e) {
                e.printStackTrace(); // imprime no console o erro
            }
        });
    }
}

// EXPLICAÇÃO DA FORMATAÇÃO: No código, a data é formatada a partir do MaskFormatter, que recebe a string "##/##/####". Depois, ao adicionar a mascara de formatação
// no JFormattedTextField, o campo é exibido com o formato convencional de datas. Além disso, o setPlaceholderCharacter('_') define que em espaços vazios apareçam um '_'.