package com.pronoob.interfacesgraficas.componentes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Objects;

public class JComboBoxTest extends JPanel implements ItemListener {
    private final JComboBox<String> combo;

    public JComboBoxTest() {
        combo = new JComboBox<>();
        combo.addItem("Rojo");
        combo.addItem("Verde");
        combo.addItem("Azul");
        combo.addItem("Amarillo");
        combo.addItem("Blanco");
        combo.addItemListener(this);
        add(combo);

        setBackground(Color.RED);

        JFrame frame = new JFrame("JComboBox Test");
        frame.add(this);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new JComboBoxTest();
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String color = (String) combo.getSelectedItem();

        switch (Objects.requireNonNull(color)) {
            case "Rojo" -> setBackground(Color.RED);
            case "Verde" -> setBackground(Color.GREEN);
            case "Azul" -> setBackground(Color.BLUE);
            case "Amarillo" -> setBackground(Color.YELLOW);
            case "Blanco" -> setBackground(Color.WHITE);
        }
    }
}
