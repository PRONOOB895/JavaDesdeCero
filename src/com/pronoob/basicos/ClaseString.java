package com.pronoob.basicos;

import java.util.Locale;
import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        /*
        La manipulacion de String es muy importante en
        cualquier lenguaje, ya que la mayoria de lo que
        el usuario digita es texto.
         */

        /*
        Vamos a hacer un programa que nos diga toda la
        informacion del String que el usuario digite.
         */

        final Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String text;

        System.out.print("Digite su texto: ");
        text = sc.nextLine();
        System.out.println("Su texto tiene " + text.length() + " caracter/es");
        System.out.println("El primer caracter del texto es: " + text.charAt(0));
        System.out.println("El ultimo caracter del texto es: " + text.charAt(text.length()-1));
        System.out.println("El texto en mayuscula: " + text.toUpperCase());
        System.out.print("El texto en minuscula: " + text.toLowerCase());
    }
}
