package TEMA1EJERCICIOS;

import java.util.Scanner;

public class EjercicioPracticaClaseClase5 {
    public static void main(String[] args) {
        double euros;
        double pesos_arg = 1.071;
        double dolares = 1.10;
        double pesoscol = 4.619;
        double cambiopesos;
        double  cambiodolares;
        double  cambiopesoscol;

        Scanner sc= new Scanner(System.in);
        System.out.println("Cuanto vale la cesta de la compra?: ");
        euros = sc.nextInt();

        cambiopesos = euros * pesos_arg;
        System.out.println("En argentina seria : " + cambiopesos);

        cambiodolares = euros * dolares;
        System.out.println("En America del Norte seria : " + cambiodolares);

        cambiopesoscol = euros * pesoscol;
        System.out.println("En Colombia seria : " + cambiopesoscol);


    }
}
