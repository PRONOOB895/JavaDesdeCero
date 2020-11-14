package com.pronoob.interfacesgraficas.componentes;

import javax.swing.*;
import java.awt.*;


public class JTextAreaTest extends JPanel {
	private final JTextField field;
	private final JTextArea area;

	public JTextAreaTest() {
		setLayout(new BorderLayout());

		JPanel panelBotones = new JPanel();
		add(panelBotones, BorderLayout.SOUTH);
		
		area = new JTextArea(15, 14);
		area.setEnabled(false);
		area.setLineWrap(true);
		add(area, BorderLayout.CENTER);
		
		field = new JTextField();
		add(field, BorderLayout.NORTH);

		JButton botonInsertar = new JButton("Insertar texto");
		botonInsertar.addActionListener(e -> area.append(field.getText()));
		panelBotones.add(botonInsertar);

		JButton botonNuevaLinea = new JButton("Nueva linea");
		botonNuevaLinea.addActionListener(e -> area.append(System.lineSeparator()));
		panelBotones.add(botonNuevaLinea);

		JFrame frame = new JFrame("JTextArea Test");
		frame.add(this);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JTextAreaTest();
	}

}
