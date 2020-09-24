package com.pronoob.basicos;

import java.util.Locale;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // Existen varios tipos de variables en Java.

        /*
        Las variables son espacios en memorias en el cual puedes
        guardar numeros enteros, numeros decimales, textos y demas.
         */

        /*
        En este codigo vamos a hacer un formulario en el que una
        persona digita su informacion, se guarda en memoria y despues
        imprimimos en pantalla la informacion.
         */

        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String nombre; // Este es un valor de tipo String, este guarda texto.
        int edad; // Este es un valor de tipo int, este guarda valores enteros.
        float dinero; // Este es un valor de tipo float, este guarda valores decimales.

        /*
        Esto son los datos mas basicos en Java. Como pueden darse cuenta,
        primero se pone el tipo de dato y despues se pone el nombre a la
        variable.
         */

        // Ahora empezamos a preguntar al usuario.
        System.out.print("Digite su nombre: ");
        nombre = sc.nextLine(); // El nombre es texto, asi que lo guardamos en String.
        System.out.print("Digite su edad: ");
        edad = sc.nextInt(); // La edad es entera, asi que la guardamos en int.
        System.out.print("Digite su cantidad de dinero: ");
        dinero = sc.nextFloat(); // El dinero es entero o decimal, asi que lo guardamos en float.

        // Aqui imprimimos la informacion que nos ha digitado.
        System.out.println("Su informacion ha sido guardada, a continuacion se mostraran los datos:");
        System.out.println(); // Linea de separacion
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Saldo: " + dinero);

        sc.close();
    }
}
