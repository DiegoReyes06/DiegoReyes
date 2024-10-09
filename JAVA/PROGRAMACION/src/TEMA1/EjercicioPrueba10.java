package TEMA1;

import java.util.Scanner;

public class EjercicioPrueba10 {
    //Pedimos por teclado el coste de fabricacion de un producto
    //Queremos pintar por pantalla el precio que le vamos a poner al producto para el cliente
    //Al coste de fabicacion hay que sumarle la ganancia para el vendedor (30%)
    //Al precio resultante le tengo que sumar el IVA (21%)
    public static void main(String[] args) {
        double precio_fabricacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el coste de fabicación del producto: ");
        precio_fabricacion = sc.nextDouble();

        double precio_venta;
        double precio_final;
        double  ganancias;
        precio_venta = precio_fabricacion + (precio_fabricacion * 30 / 100);
        System.out.println("Dime el precio de venta " + precio_venta + " $");

        precio_final = precio_venta + (precio_venta * 21 / 100);
        System.out.println("Dime el precio final " + precio_final + " $");

        ganancias = precio_final - precio_fabricacion;
        System.out.println("Las ganancias del vendedor son " + ganancias + " $");
    }
}
