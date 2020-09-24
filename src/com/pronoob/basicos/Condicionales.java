package com.pronoob.basicos;

import java.util.Locale;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        /*
        Los condicionales en Java nos permiten ejecutar
        codigo si la condicion dentro de el se cumple.
         */

        /*
        En Java hay 2 opciones para usar condicionales,
        podemos usar un if() o un switch().

        El if() funciona poniendo la condicion dentro de los parentesis.
        Ejemplo:
        if(x == 1) {
            AQUI VA EL CODIGO
        }

        El switch() funciona poniendo el elemento a condicionar dentro
        del parentesis.
        Ejemplo:
        switch(x) {
            case 1 -> {
                AQUI VA EL CODIGO
            }
        }
         */

        /*
        Vamos a hacer un miniexamen de Matematicas usando los
        2 tipos de condicionales.
         */
        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int correctas = 0, incorrectas = 0;

        System.out.println("Examen de Matematicas");
        System.out.println("RESPONDA SI O NO");

        System.out.println("Pregunta #1");
        System.out.println("232+498 = 730");

        if (sc.nextLine().toLowerCase().equals("si")) { // Si esta condicion se cumple, se ejecuta el codigo
            correctas += 1;
        }
        else {
            incorrectas += 1;
        }

        System.out.println("Pregunta #2");
        System.out.println("11*45 = 500");

        switch (sc.nextLine().toLowerCase()) {
            case "no" -> correctas += 1;
            case "si" -> incorrectas += 1;
        }

        /*
        Como pueden ver, el switch en este caso tiene una sintaxis mas limpia
        pero es recomendable para Strings usar if con el metodo equals()
         */

        System.out.println("Sacaste " + correctas + " correcta/s y " + incorrectas + " incorrecta/s");
    }
}
