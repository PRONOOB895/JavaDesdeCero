package com.pronoob.interfacesgraficas.componentes;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class JRadioButtonTest extends JPanel {
    private final JFrame frame;

    public JRadioButtonTest() {
        frame = new JFrame("JRadioButton Test");

        JLabel text = new JLabel("Cuanto equivale PI?");
        add(text);

        ButtonGroup group = new ButtonGroup();
        JRadioButton radButton1 = new JRadioButton("3,141592");
        radButton1.setActionCommand("Correcto");
        JRadioButton radButton2 = new JRadioButton("3,149215");
        radButton2.setActionCommand("Incorrecto");
        group.add(radButton1);
        group.add(radButton2);
        add(radButton1);
        add(radButton2);

        JButton button = new JButton("Responder");
        button.addActionListener(e -> {
            System.out.println(group.getSelection().getActionCommand());
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        });
        add(button);

        frame.add(this);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JRadioButtonTest();
    }
}
