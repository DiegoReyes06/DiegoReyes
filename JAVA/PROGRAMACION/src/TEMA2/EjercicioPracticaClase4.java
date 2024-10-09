package TEMA2;

import java.util.Scanner;

public class EjercicioPracticaClase4 {
    public static void main(String[] args) {
        //si la edad esta entre 1 y 11, hay que pintar hola niño
        //si la edad esta entre 12 y 17, hay que pintar hola chaval
        //si la edad esta entre 18 y 29, hay que pintar hola tio
        //si la edad  esta entre 30 y 60, hay que poner hola hombre
        //si la edad es <60, hola abuelo
        int edad;
        String sexo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres 'h' o 'm'");
        sexo = sc.nextLine();

        System.out.println("¿Que edad tienes? ");
        edad = sc.nextInt();

        if (edad >= 1 && edad <= 11){
            if (sexo == "h") {
                System.out.println("Hola niño");
            }else System.out.println("Hola niña");
        }if (edad >= 12 && edad <= 17){
            if (sexo == "h") {
                System.out.println("Hola chaval");
            }else System.out.println("Hola chavala");
        }if (edad >= 18 && edad <=29){
            if (sexo == "h") {
                System.out.println("Hola tio");
            }else System.out.println("Hola tia");
        }if (edad >= 30 && edad <=60){
            if (sexo == "h") {
                System.out.println("Hola  hombre");
            }else System.out.println("Hola mujer");
        }if (edad >60){
            if (sexo == "h") {
                System.out.println("Hola abuelo");
            }else System.out.println("Hola abuela");
        }
    }
}
