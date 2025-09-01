package SwingInterface;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstInterface {
    public static void main(String[] args) {
        // Criar uma janela (JFrame)
        JFrame frame = new JFrame("Minha Primeira Interface Swing");
        frame.setSize(400, 300); // largura x altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adicionar um texto (JLabel)
        JLabel label = new JLabel("Olá, mundo com Swing!", JLabel.CENTER);
        frame.add(label);

        // Tornar a janela visível
        frame.setVisible(true);
    }
}