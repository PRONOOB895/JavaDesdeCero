package com.pronoob.interfacesgraficas.componentes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class JTextFieldTest extends JPanel {
    private final JFrame frame;
    private final JTextField field;

    public JTextFieldTest() {
        JLabel label = new JLabel("Escribe aqui:");
        add(label);
        
        field = new JTextField(20);
        field.addKeyListener(new EnterPresionado());
        add(field);

        JButton button = new JButton("Listo");
        button.addActionListener(new BotonPresionado());
        add(button);

        frame = new JFrame("JTextField Test");
        frame.add(this);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    private class BotonPresionado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Has escrito: " + field.getText());
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }
    }
    
    private class EnterPresionado extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                System.out.println("Has escrito: " + field.getText());
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            }
        }
    }
    
    public static void main(String[] args) {
        new JTextFieldTest();
    }
}
