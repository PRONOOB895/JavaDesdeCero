package com.pronoob.poo;

/*
Java nos permite tener mas de una clase en el mismo archivo
pero siempre debe haber una clase publica con el nombre del archivo.

El resto deben ser clases no publicas
 */

/*
Este codigo esta inspirado del canal pildorasinformaticas.
Practicamente uso su codigo pero le hago algunas mejoras.
 */

import java.util.*;

/*
Imaginemos que tenemos una empresa y queremos gestionar nuestro empleados
 */

@SuppressWarnings("all")
// Vamos a heredar todos lo metodos de Persona
public class Empleado extends Persona implements Comparable {
    // Aqui vamos a crear las variables de instancia
    // En otras palabras, donde vamos a guardar lo que nos de el constructor
    private String claveDeAcceso, ID;
    private int contadorID = 1, sueldo;
    private final Date fechaDeIngreso;

    // El constructor
    public Empleado(String nombre, int sueldo, Date fechaDeIngreso) {
        // La palabra this nos permite acceder a la variable declarada al principio
        // Sin esta quedaria x = x, eso no tendria sentido
        super(nombre);
        nuevaClaveDeAcceso();
        this.sueldo = sueldo;
        this.fechaDeIngreso = fechaDeIngreso;
        this.ID = getIdentificacion() + ":" + contadorID;
        contadorID++;
    }

    // Otro constructor para el que quiera usar GregorianCalendar
    public Empleado(String nombre, int sueldo, GregorianCalendar fechaEnCalendario) {
        super(nombre);
        nuevaClaveDeAcceso();
        this.sueldo = sueldo;
        this.fechaDeIngreso = fechaEnCalendario.getTime();
        this.ID = getIdentificacion() + ":" + contadorID;
        contadorID++;
    }

    // Aqui va otro constructor para el que no quiera usar la clase GregorianCalendar
    public Empleado(String nombre, int sueldo, int year, int mes, int dia) {
        super(nombre);
        nuevaClaveDeAcceso();
        this.sueldo = sueldo;
        this.fechaDeIngreso = new GregorianCalendar(year, mes - 1, dia).getTime();
        this.ID = getIdentificacion() + ":" + contadorID;
        contadorID++;
    }

    // Aqui declaramos variables que no tengan que ver con el constructor
    private boolean empleadoDelMes = false;

    /*
    En la programacion orientada a objetos es una mala practica que se pueda
    acceder directamente a las variables, lo que se hacen son metodos que asignan
    y devuelven la variable (Setters y Getters)
     */

    public int getSueldo() {
        return sueldo;
    }

    public void subirSueldo(double porcentaje) {
        sueldo += sueldo * porcentaje / 100;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean getEmpleadoDelMes() {
        return empleadoDelMes;
    }

    public void setEmpleadoDelMes(boolean empleadoDelMes) {
        this.empleadoDelMes = empleadoDelMes;
    }

    public String getDatosDelEmpleado() {
        return "Nombre: " + getNombre() +
                ", Fecha de ingreso: " + fechaDeIngreso +
                ", Sueldo: " + sueldo +
                ", Empleado del mes: " + empleadoDelMes +
                ", Clave de acceso: " + claveDeAcceso;
    }

    public Date getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public String getClaveDeAcceso() {
        return claveDeAcceso;
    }

    public String getID() {
        return ID;
    }

    // No hay setNombre() ya que no deberiamos poder cambiarla
    // No hay setFechaDeIngreso() ya que no deberiamos poder cambiarla

    // Otros metodos que no sean setters y getters
    public void nuevaClaveDeAcceso() {
        // Generacion de claves
        String caracteresPermitidos = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder claveDeAcceso = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            int numeroRandom = new Random().nextInt(36);
            claveDeAcceso.append(caracteresPermitidos.substring(numeroRandom, numeroRandom+1));
        }

        this.claveDeAcceso = claveDeAcceso.toString();
    }

    @Override
    public int compareTo(Object o) {

        Empleado empleado = (Empleado) o;

        if (this.sueldo < empleado.sueldo) return -1;

        if (this.sueldo > empleado.sueldo) return 1;

        return 0;
    }
}