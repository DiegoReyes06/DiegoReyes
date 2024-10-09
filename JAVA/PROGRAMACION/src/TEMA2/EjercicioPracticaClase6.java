package TEMA2;

import java.util.Scanner;

public class EjercicioPracticaClase6 {
    public static void main(String[] args) {

        //Vida Jugador = 0-100
        //Vida Monstruo = 0-50
        //Puntos Espada = 0-50
        //Runa Magica = true / false

        // Es un combate entre el jugador y el monstruo.
        // Gana el jugador si:
        //          - VidaJugador > 50 y PuntosEspada > 30
        //          - VidaJugador < 50 y PuntosEspada > 50
        //          - VidaJugador < 50 y PuntosEspada < 30 y RunaMagica = true

        // Gana el monstruo si:
        //          - Si la vida del jugador es menor de 50 y los puntos
        //          de la espada menor que 50,
        //          O si la vida del jugador es menor de 50 y RunaMagica = false



        Scanner sc = new Scanner(System.in);
        System.out.println("Que salud tiene hasta el momento caballero?");
        int vidaJugador = sc.nextInt();

        System.out.println("Que vida tiene el monstruo de enfrente?");
        int vidaMonstruo = sc.nextInt();

        System.out.println("Que puntos de espada lleva adquiridos hasta el momento?");
        int puntosEspada = sc.nextInt();

        boolean runaMagica = true;


    }
}
