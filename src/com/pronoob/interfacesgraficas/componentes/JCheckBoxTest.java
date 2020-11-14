package com.pronoob.interfacesgraficas.componentes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JCheckBoxTest extends JPanel implements ItemListener {
	private JFrame frame;
	private JPanel panelCheckBox;
	private JLabel text1;
	private JLabel text2;
	private JLabel text3;
	private JCheckBox boldCheckBox;
	private JCheckBox italicsCheckBox;
	private int fontStyles;
	
	public JCheckBoxTest() {
		setLayout(new BorderLayout());
		
		text1 = new JLabel("Texto de prueba", SwingConstants.CENTER);
		text1.setFont(new Font(Font.SERIF, Font.PLAIN, 32));
		add(text1, BorderLayout.CENTER);
		
		panelCheckBox = new JPanel();
		add(panelCheckBox, BorderLayout.SOUTH);
		
		boldCheckBox = new JCheckBox();
		boldCheckBox.addItemListener(this);
		panelCheckBox.add(boldCheckBox);
		
		text2 = new JLabel("Negrita");
		panelCheckBox.add(text2);
		
		italicsCheckBox = new JCheckBox();
		italicsCheckBox.addItemListener(this);
		panelCheckBox.add(italicsCheckBox);
		
		text3 = new JLabel("Cursiva");
		panelCheckBox.add(text3);
		
		frame = new JFrame("JCheckBox Test");
		frame.add(this);
		frame.setSize(600, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JCheckBoxTest();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource().equals(boldCheckBox)) {
			if (boldCheckBox.isSelected()) fontStyles += Font.BOLD;
			else fontStyles -= Font.BOLD;
		}
		else {
			if (italicsCheckBox.isSelected()) fontStyles += Font.ITALIC;
			else fontStyles -= Font.ITALIC;
		}
		
		text1.setFont(new Font(Font.SERIF, fontStyles, 32));
	}

}
