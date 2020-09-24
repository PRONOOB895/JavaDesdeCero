package com.pronoob.basicos;

import java.util.Locale;
import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {
        /*
        En este codigo vamos a hablar de la clase Scanner.
        Esta clase nos ayuda a que el usuario pueda digitar
        datos por consola.
         */

        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        /*
        El Scanner es la clase que importamos
        al principio y nos permite que el usuario
        inserte informacion al programa.

        La palabra reservada final es para que no se pueda cambiar el valor.

        El metodo useLocale() es para cambiar la ubicacion,
        en Latinoamerica es usa la coma para separar decimales
        pero en este caso nos conviene separarlos por puntos
        como en Estados Unidos.
         */

        /*
        Voy a hacer un programa que devuelva lo mismo que escribio
         */

        System.out.print("Escriba cualquier cosa: "); // Le pido escribir cualquier cosa
        System.out.println(sc.nextLine()); // nextLine() es lo que nos va a devolver lo que digito
    }

}