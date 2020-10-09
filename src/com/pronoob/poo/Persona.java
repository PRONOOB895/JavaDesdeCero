package com.pronoob.poo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Persona {
    private String nombre;
    private int identificacion;
    private Locale lugarDeNacimiento;
    private GregorianCalendar diaDeNacimiento;

    protected Persona() {
        this.nombre = null;
        this.identificacion = 0;
        this.lugarDeNacimiento = Locale.US;
        this.diaDeNacimiento = new GregorianCalendar(2000, Calendar.JANUARY, 1);
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.identificacion = 0;
        this.lugarDeNacimiento = Locale.US;
        this.diaDeNacimiento = new GregorianCalendar(2000, Calendar.JANUARY, 1);
    }

    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.lugarDeNacimiento = Locale.US;
        this.diaDeNacimiento = new GregorianCalendar(2000, Calendar.JANUARY, 1);
    }

    public Persona(String nombre, int identificacion, Locale lugarDeNacimiento, GregorianCalendar diaDeNacimiento) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.lugarDeNacimiento = lugarDeNacimiento;
        this.diaDeNacimiento = diaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public Locale getLugarDeNacimiento() {
        return lugarDeNacimiento;
    }

    public void setLugarDeNacimiento(Locale lugarDeNacimiento) {
        this.lugarDeNacimiento = lugarDeNacimiento;
    }

    public GregorianCalendar getDiaDeNacimiento() {
        return diaDeNacimiento;
    }

    public void setDiaDeNacimiento(GregorianCalendar diaDeNacimiento) {
        this.diaDeNacimiento = diaDeNacimiento;
    }
}
