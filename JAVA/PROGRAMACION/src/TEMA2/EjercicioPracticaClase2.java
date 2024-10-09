package TEMA2;

import java.sql.SQLOutput;

public class EjercicioPracticaClase2 {
    public static void main(String[] args) {
        //Personaje tiene vida y mana
        //Si la vida es menor que 50 pinto que tiene que tomar pocion de vida
        //Si el mana es menor que 50 pinto que tiene que tomar pocion de mana
        //Si la vida es menor que 50 y el mana el menor que 50 que  pinte CORRE

        int vidaP = 45;
        int manaP = 33;

        if (vidaP <= 50){
            System.out.println("TOma una pocion de vida");
        }
        if (manaP <=50){
            System.out.println("Toma pocion de mana");
        }
        if (vidaP <= 50 && manaP <= 50){
            System.out.println("CORRE");
        }
    }
}
