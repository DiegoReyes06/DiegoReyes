package TEMA2;

import java.util.Scanner;

public class EjercicioPracticaClase5 {
    public static void main(String[] args) {
        //Pedir por teclado la hora
        //6-12 Buenos dias
        //12-20  Buenas tardes
        //En otro caso Buenas noches

        //Pedir nivel del jugador
        //1-5:
        //1. Iniciado
        //2. Amateur
        //3. Profesional
        //4. Experto
        //5. Dios
        //Buenos dias jugador de nivel  Iniciado
        int hora;
        int nivel;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Muy buenas jugador, que hora es? ");
        hora = sc.nextInt();
        System.out.println("¿Cual es  tu nivel de hechicero? ");
        nivel = sc.nextInt();

        if (hora >= 6 && hora <= 12) {
            if (nivel == 1) {
                System.out.println("Muy buenos dias hechizero nivel INICIADO!!");
            } else if (nivel == 2) {
                System.out.println("Muy buenos dias hechizero de nivel AMATEUR!!");
            } else if (nivel == 3) {
                System.out.println("Muy buenos dias hechizero de nivel PROFESIONAL!!");
            } else if (nivel == 4) {
                System.out.println("Muy buenos dias hechizero de nivel EXPERTO!!");
            } else if (nivel == 5) {
                System.out.println("Muy buenos dias hechizero de nivel DIOS!!");
            }
        }if (hora > 12 && hora <= 20){
            if (nivel == 1) {
            System.out.println("Muy buenas tardes hechizero nivel INICIADO!!");
            } else if (nivel == 2) {
            System.out.println("Muy buenas tardes hechizero de nivel AMATEUR!!");
            } else if (nivel == 3) {
            System.out.println("Muy buenas tardes hechizero de nivel PROFESIONAL!!");
            } else if (nivel == 4) {
            System.out.println("Muy buenas tardes hechizero de nivel EXPERTO!!");
            } else if (nivel == 5) {
            System.out.println("Muy buenas tardes hechizero de nivel DIOS!!");
            }
        } else {
            if (hora > 20) {
                if (nivel == 1) {
                    System.out.println("Muy buenas noches hechizero nivel INICIADO!!");
                } else if (nivel == 2) {
                    System.out.println("Muy buenas noches hechizero de nivel AMATEUR!!");
                } else if (nivel == 3) {
                    System.out.println("Muy buenas noches hechizero de nivel PROFESIONAL!!");
                } else if (nivel == 4) {
                    System.out.println("Muy buenas noches hechizero de nivel EXPERTO!!");
                } else if (nivel == 5) {
                    System.out.println("Muy buenas noches hechizero de nivel DIOS!!");
                }
            }
        }
    }

}

