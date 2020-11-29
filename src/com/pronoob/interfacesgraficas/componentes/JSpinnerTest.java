package com.pronoob.interfacesgraficas.componentes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSpinnerTest extends JPanel implements ChangeListener {
    JFrame frame;
    JSpinner numSpinner1, numSpinner2;
    JLabel label;

    public JSpinnerTest() {
        numSpinner1 = new JSpinner();
        numSpinner1.setPreferredSize(new Dimension(150, 30));
        numSpinner1.addChangeListener(this);
        add(numSpinner1);

        numSpinner2 = new JSpinner();
        numSpinner2.setPreferredSize(new Dimension(150, 30));
        numSpinner2.addChangeListener(this);
        add(numSpinner2);

        label = new JLabel("La suma de estos dos numeros es: 0");
        add(label);

        frame = new JFrame();
        frame.add(this);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JSpinnerTest();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int sum = (int) numSpinner1.getValue() + (int) numSpinner2.getValue();
        label.setText("La suma de estos dos numeros es: " + sum);
    }
}
