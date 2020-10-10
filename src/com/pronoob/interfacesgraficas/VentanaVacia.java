package com.pronoob.interfacesgraficas;

/*
Vamos a crear una ventana, para crear una ventana necesitamos importar la clase
javax.swing.Frame

Voy a importar el paquete entero
 */

import javax.swing.*;
import java.awt.*;

public class VentanaVacia {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // Obtenemos las dimensiones del monitor

    // Hacemos la ventana dentro del constructor
    public VentanaVacia() {
        JFrame frame = new JFrame(); // Creamos un Frame con JFrame
        frame.setSize(screenSize.width / 2, screenSize.height / 2); // El ancho y largo de la ventana es la mitad de la resolucion
        frame.setLocationRelativeTo(null); // Con esto centramos la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cada vez que cerremos la ventana, termina la ejecucion
        frame.setTitle("Ventana"); // Asignamos el titulo a la ventana
        frame.setVisible(true); // Hacemos la ventana visible

        Image icon = Toolkit.getDefaultToolkit().getImage("src\\com\\pronoob\\interfacesgraficas\\icon.png");
        frame.setIconImage(icon); // Le pongo un icono personalizado
    }

    // Ejecutamos la ventana dentro del metodo main
    public static void main(String[] args) {
        new VentanaVacia(); // Instanciamos el constructor
    }
}
