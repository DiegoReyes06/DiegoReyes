package TEMA3;

public class EXPLICACION_MATRICES {

    //Paso 1: ¿Qué es una matriz 6x6?
    //Imagina que tienes una tabla con 6 filas y 6 columnas. Es como una cuadrícula de 6x6. Cada uno de los puntos en
    // esta tabla puede tener un número. A esta tabla le llamamos matriz, y el número de filas y columnas que tiene
    // define su tamaño. En este caso, queremos una matriz 6x6, lo que significa que tendrá 6 filas y 6 columnas,
    // totalizando 36 celdas.

    //Paso 2: ¿Cómo llenamos la matriz con números aleatorios?
    //En el ejercicio, vamos a llenar esta matriz con números aleatorios. Es decir, en lugar de escribir los números
    // nosotros, vamos a decirle al ordenador que genere números al azar dentro de un rango que elijamos. Por ejemplo,
    // podemos generar números entre 0 y 9. Esto se puede hacer fácilmente en Python con la función.

//
    //public static double numeroAleatorio(int min, int max) {
    //    return (int) (Math.random() * (max - min + 1) + min);

    //}
//

    //Paso 3: ¿Qué son las diagonales de una matriz?
    //En una matriz cuadrada (como nuestra matriz 6x6), hay dos diagonales que nos interesan:
    //Diagonal principal: Es la diagonal que va desde la parte superior izquierda hasta la parte inferior derecha.
    //En una matriz de 6x6, los elementos de la diagonal principal son los que tienen las mismas coordenadas en fila
    //y columna. O sea, los elementos que se encuentran en las posiciones (0,0), (1,1), (2,2), etc.


    //Explicación del código:
    //1. Para llenar la matriz con valores aleatorios entre 0 y 9, utilizamos laclase numeroAleatorio que creamos
    //nosotros que nos permite generar números aleatorios.

    public static int numeroAleatorio(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    //2. Crear la matriz 6x6.
    //Primero, necesitamos crear la matriz de tamaño 6x6. Para esto, usamos una matriz bidimensional en Java:

    public static void main(String[] args) {

        int[][] matriz = new int[6][6];     //Esto es debido a que la matriz es de 6x6. Al rellenar esto [][] lo
                                            //rellenaremos con la magnitud de la matriz.



        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                 matriz[i][j] = numeroAleatorio(1,9);                           //Luego, usamos un par de bucles for para recorrer cada fila y cada columna
            }
        }
                                            //de la matriz y asignarle un valor aleatorio entre 0 y 9:


    }

}
