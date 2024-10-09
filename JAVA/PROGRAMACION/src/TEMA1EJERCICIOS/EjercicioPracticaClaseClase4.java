package TEMA1EJERCICIOS;

import java.util.Scanner;

public class EjercicioPracticaClaseClase4 {
    public static void main(String[] args) {
        int numero;
        int numero1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        numero = sc.nextInt();
        int decimal = 10;
        int decenas;
        int unidades;

        decenas = numero / decimal;
        System.out.println(decenas);
        unidades = numero % decimal;
        System.out.println(unidades);

        numero1 = (unidades * decimal) + decenas;
        System.out.println(numero1);


    }
}
