package TEMA1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrecioCantidad {
    public static void main(String[] args) {
        //Datos de entrada: precio de un producto y la cantidad
        //Datos de salida: precio final, aplicando el IVA(21%)

        //DECLARACION DE VARIABLES
        double precio = 59.95;
        String nombre;
        int cantidad = 4;
        double  precioFinal = 0;
        double precioIVA = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del producto ");
        nombre = sc.nextLine();

        System.out.println("Dime el precio del producto ");
        precio = sc.nextDouble();

        System.out.println("Dime la cantidad ");
        cantidad = sc.nextInt();

        precioIVA = precio * 1.21;
        precioFinal = precioIVA * cantidad;

        System.out.println("El precio total de la compra de " + nombre + "es " + precioFinal);


    }
}
