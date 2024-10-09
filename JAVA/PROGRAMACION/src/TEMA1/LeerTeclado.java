package TEMA1;

import java.util.Scanner;

public class LeerTeclado {
    public static void main(String[] args) {
        String nombre;

        //Crea una variable (sc) de tipo objeto que sirve para leer de teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nombre: ");
        nombre = sc.nextLine();//Lee  una linea de teclado y la guarda en la variable nombre

        System.out.println("Tu nombre es " + nombre);
    }
}
