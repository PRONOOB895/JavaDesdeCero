package com.pronoob.interfacesgraficas.componentes;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderTest extends JPanel implements ChangeListener {
    JFrame frame;
    JSlider slider1, slider2, slider3;

    public JSliderTest() {
        slider1 = new NuevoSlider(this);
        slider2 = new NuevoSlider(this);
        slider3 = new NuevoSlider(this);
        add(slider1);
        add(slider2);
        add(slider3);

        setBackground(new Color(0, 0, 0));

        frame = new JFrame();
        frame.add(this);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        setBackground(new Color(slider1.getValue(), slider2.getValue(), slider3.getValue()));
    }

    public static void main(String[] args) {
        new JSliderTest();
    }
}

class NuevoSlider extends JSlider {
    public NuevoSlider(ChangeListener listener) {
        super(0, 255, 0);
        setMajorTickSpacing(25);
        setMinorTickSpacing(5);
        setPaintTicks(true);
        addChangeListener(listener);
    }
}
