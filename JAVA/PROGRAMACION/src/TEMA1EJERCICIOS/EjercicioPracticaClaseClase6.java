package TEMA1EJERCICIOS;

public class EjercicioPracticaClaseClase6 {
    public static void main(String[] args) {
        double velocidadinicial = 58000;
        double veocidadfinal;
        double añoinicial = 1977;
        double añofinal = 2024;
        double velocidadfinal;
        double año = 8760;
        double añosfuncional;
        
        añosfuncional = añofinal - añoinicial;
        System.out.println("Lleva años funcionando: " + añosfuncional);

        veocidadfinal= velocidadinicial * 8760;
        System.out.println("La velocidad realizada en un año es: " + veocidadfinal);

        velocidadfinal = veocidadfinal * 47;
        System.out.println("Hoy en dia va a una velocidad de: " + velocidadfinal + " km/h");


    }
}
