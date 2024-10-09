package TEMA1EJERCICIOS;

import java.util.Scanner;

public class EjercicioPracticaClase1 {
    public static void main(String[] args) {
        //Un alumno quiere saber su nota final de programacion
        //Tres examenes parciales: nota1, nota2, nota3 -> 55%     (nota media)
        //Examen final: notaExamenFinal -> 30%
        //Trabajo final -> 15%

        double nota1;
        double nota2;
        double nota3;
        double nota_media;
        double nota_media_porcentual;
        double examen_final;
        double nota_examen_final_porcentual;
        double trabajo_final;
        double nota_trabajo_final;
        double nota_final;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nota del primer examen: ");
        nota1 = sc.nextDouble();

        System.out.println("Dime la nota del segundo examen: ");
        nota2 = sc.nextDouble();

        System.out.println("Dime la nota del tercer examen: ");
        nota3 = sc.nextDouble();

        nota_media = (nota1 + nota2 + nota3) / 3;
        nota_media_porcentual = nota_media * 55 / 100;

        System.out.println("Dime la nota del examen final: ");
        examen_final = sc.nextDouble();
        nota_examen_final_porcentual = examen_final * 30 / 100;

        System.out.println("Dime la nota del trabajo final: ");
        trabajo_final = sc.nextDouble();
        nota_trabajo_final = trabajo_final * 15 / 100;

        nota_final = nota_media_porcentual + nota_examen_final_porcentual + nota_trabajo_final;
        System.out.println("La nota final del curso es " + nota_final);


        double palabra;
    }
}
