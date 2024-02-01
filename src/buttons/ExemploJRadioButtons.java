package buttons;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJRadioButtons extends JFrame {
    private JRadioButton diretaRadioButton;
    private JRadioButton indiretaRadioButton;

    public ExemploJRadioButtons() {
        super("Exemplo de JRadioButtons");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        // Criando os radio buttons
        diretaRadioButton = new JRadioButton("Direta");
        indiretaRadioButton = new JRadioButton("Indireta");

        // Criando um grupo para os radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(diretaRadioButton);
        group.add(indiretaRadioButton);

        // Criando o botão "Próximo"
        JButton proximoButton = new JButton("Próximo");

        proximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificando se algum radio button está selecionado
                if (diretaRadioButton.isSelected() || indiretaRadioButton.isSelected()) {
                    JOptionPane.showMessageDialog(ExemploJRadioButtons.this, "Selecionado: " +
                            (diretaRadioButton.isSelected() ? "Direta" : "Indireta"));
                } else {
                    JOptionPane.showMessageDialog(ExemploJRadioButtons.this, "Selecione uma opção.");
                }
            }
        });

        // Layout
        setLayout(new GridLayout(3, 1));
        add(diretaRadioButton);
        add(indiretaRadioButton);
        add(proximoButton);

        // Configurando a janela
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ExemploJRadioButtons();
            }
        });
    }
}

