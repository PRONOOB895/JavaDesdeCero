package com.pronoob.basicos;

public class Matrices {
    public static void main(String[] args) {
        /*
        Una matriz es un vector que tiene varios vectores adentro.

        Asi se declara una matriz:
            tipoDeDato[][] nombre;

        Esa es una matriz sin inicializar, podemos inicializarlas de 2 formas:

            Esta es una matriz vacia pero con longitudes predefinidas:
                tipoDeDato[][] nombre = new tipoDeDato[longitud1][longitud2];

            Esta es una matriz con datos y longitudes predefinidas:
                tipoDeDato[][] nombre = {{Dato1,Dato2,Dato3...},{Dato1,Dato2,Dato3...},{Dato1,Dato2,Dato3...}...};

                El interpretador detecta la longitud automaticamente.

        Asi se accede a los datos dentro de la matriz:
            numerosPares[longitud1][longitud2]
         */

        int[][] numeros = new int[3][3];
        /*
        Nos podemos imaginar una matriz como un cuadrado de tamaño longitud1*longitud2
        En este caso es de 3*3

        Esta matriz se puede representar de esta manera:
            (Los numeros son las longitudes y las letras son datos)

               0  1  2
            0  a  b  c
            1  d  e  f
            2  g  h  i

            numeros[0][0] = a;
            numeros[0][1] = b;
            numeros[0][2] = c;

            numeros[1][0] = d;
            numeros[1][1] = e;
            numeros[1][2] = f;

            numeros[2][0] = g;
            numeros[2][1] = h;
            numeros[2][2] = i;
         */

        // Vamos a hacer un bucle dentro de un bucle para poder añadir los datos
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[0].length; j++) {
                numeros[i][j] = (i+1)*(j+1);
            }
        }
        /*
        La matriz actual se veria asi:

            1  2  3
            2  4  6
            3  6  9
         */

        // Imprimir los numeros
        for (int[] i : numeros) {
            for (int k : i) {
                System.out.println(k);
            }
        }

        // Voy a hacer una matriz con datos predefinidos
        String[][] texto = {{"1","2","3"},{"A","B","C"},{"a","b","c"}};
        // Podemos usar estos datos para lo que queramos
    }
}
