package com.pronoob.interfacesgraficas;

import javax.swing.*;
import java.awt.*;

public class VentanaConTexto {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

    public VentanaConTexto() {
        JFrame frame = new JFrame();
        frame.setSize(screenSize.width/4, screenSize.height/4);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Ventana con texto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JLabel text = new JLabel("Este es un texto");
        panel.add(text);

        frame.add(panel);
    }

    public static void main(String[] args) {
        new VentanaConTexto();
    }
}
