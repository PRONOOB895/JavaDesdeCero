package com.pronoob.basicos;
// En Java, los codigos tienen que estar dentro de una clase

/*
Las clases son un contenedor de codigo, el nombre de la clase
debe ser totalmente igual al nombre del archivo con extension .java
 */
public class HolaMundo {
    // El metodo main es donde corre el codigo
    public static void main(String[] args) {
        System.out.println("Hola Mundo"); // Esta es la funcion para imprimir texto en consola
        // System.out.println() imprime texto y despues salta la linea.
        System.out.print("Hola Mundo pero sin saltar linea. ");
        // System.out.print() imprime texto y no salta linea.
        /*
        Eso quiere decir que si escribimos texto despues de esto
        va a estar justo al lado del anterior
         */
        System.out.println("Despues de este texto salta la linea");
        System.out.print("Ya salto linea");
    }
}
