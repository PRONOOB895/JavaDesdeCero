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
        // Hasta ahora normal, hemos asignado objetos de tipo Persona en nuestro vector de Persona

        // El polimorfismo nos permite guarda un objeto diferente del tipo Persona
        personas[3] = new Empleado("John", 4000, new GregorianCalendar(2004, Calendar.AUGUST, 5));
        // No podemos guardar cualquier tipo de objeto en el vector de tipo Persona
        // Podemos guardar clases que heredan a este
    }
}
