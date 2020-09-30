package com.pronoob.basicos;

import java.util.Arrays;

public class Vectores {
    public static void main(String[] args) {
        /*
        Los vectores permiten guardar multiples datos de un
        tipo de dato con una longitud predefinida.
         */

        /*
        Para crear un vector debes poner el tipo de dato
        y justo al lado abrir y cerrar una llave, despues
        le das nombre al vector.

        EJEMPLOS:
        tipoDeDato[] nombre;

        int[] nombre;
        String[] nombre;
        double[] nombre;
        float[] nombre;

        Estos vectores mostrados no estan inicializados
        por lo cual no tienen ninguna longitud.

        Para inicializarlos hay que hacer lo siguiente:

            Este creara un vector vacio pero con longitud n.
            tipoDeDato[] x = new tipoDeDato[n];

            Pero puedes meter datos en la misma inicializacion entre llaves:
            tipoDeDato[] y = {Dato1, Dato2, Dato3...};

            Aqui no hay que poner la longitud porque el compilador detecta cuantos datos has puesto
         */

        int[] onceNumerosNaturales = new int[11]; // Aqui solo definimos la longitud

        // Por un bucle añadire 10 numeros naturales
        for (int i = 0; i < 10; i++) {
            // El vector empieza a contar desde 0 hasta 10
            // Para acceder a un espacio del vector hacemos lo siguiente
            onceNumerosNaturales[i] = i+1;

            /*
            En la primera iteracion asigna al espacio 0, 0+1.
            onceNumerosNaturales[0] = 0+1;

            En la segunda iteracion:
            onceNumerosNaturales[1] = 1+1;
            ...

            En la ultima:
            onceNumerosNaturales[9] = 9+1
             */
        }
        // Son once numeros pero en el bucle solo asignamos 10
        // El ultimo lo asignare manualmente
        onceNumerosNaturales[10] = 11;

        // Ahora voy a imprimir en pantalla el vector
        // Hay que importar la clase Arrays para poder convertirlo en String y poder verlo en pantalla
        System.out.println(Arrays.toString(onceNumerosNaturales));
        // Si no lo convertimos a String nos saliera los siguiente: [I@4dd8dc3

        // Tambien podemos imprimir solo uno de los datos dentro del vector
        System.out.println(onceNumerosNaturales[7]);

        // Ahora quiero hacer una suma de dos posiciones en onceNumerosNaturales
        int suma = onceNumerosNaturales[3] + onceNumerosNaturales[6];
        // Ahora lo imprimo
        System.out.println(suma);


        // Ahora declarare un vector de tipo String con datos predefinidos
        String[] textos = {"Hola", "Adios", "Ejemplo", "Posicion4", "Ultimo"};

        // Lo imprimo
        System.out.println(Arrays.toString(textos));
    }
}
