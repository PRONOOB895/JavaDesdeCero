package com.pronoob.poo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Polimorfismo {
    public static void main(String[] args) {
        // Voy a crear un vector de tipo Persona
        Persona[] personas = new Persona[4];

        personas[0] = new Persona("Pedro", 901);
        personas[1] = new Persona("Sofia", 232);
        personas[2] = new Persona("Luis", 825);
        // Hasta ahora normal, he asignado objetos de tipo Persona en nuestro vector de Persona

        // El polimorfismo nos permite guarda un objeto diferente del tipo Persona
        personas[3] = new Empleado("John", 4000, new GregorianCalendar(2004, Calendar.AUGUST, 5));
        // No podemos guardar cualquier tipo de objeto en el vector de tipo Persona
        // Podemos guardar clases que heredan a este

        // Creo un bucle que me imprima todos los nombres de ellos
        for (Persona p : personas) {
            System.out.println(p.getNombre());
        }

        // Quiero usar los metodos de la clase Empleado en mi objeto Empleado (personas[3])
        // No puedo ya que el vector es de tipo Persona
        // Para arreglar esto podemos castear el objeto
        Empleado miEmpleado = (Empleado) personas[3];

        // Ahora puedo utilizar todos los metodos de la clase Empleado!
        miEmpleado.subirSueldo(25);
        System.out.println(miEmpleado.getDatosDelEmpleado());
    }
}
