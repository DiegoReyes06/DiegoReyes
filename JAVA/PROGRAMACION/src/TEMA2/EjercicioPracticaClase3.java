package TEMA2;

public class EjercicioPracticaClase3 {
    public static void main(String[] args) {                                        //ELSE ES LO CONTRARIO A LO QUE NOS SEÑALA EL IF
        //VidaP, MagiaP, EscudoEspecial (boolean)                                   //SINO SE CUMPLE LO PRIMERO SALTAMOS AL SEGUNDO
        //Si  vidaP es menor que 50 y no tiene escudo pinta Toma Pocion
        //Sino si MagiaP  es menor que 50 y no tiene escudo pinta Toma Pocion Magia
        //Sino si VidaP es menor que 50 y MagiaP es menor que 0 -> Tomate algo y corre

        int vidaP = 40;
        int magiaP = 55;
        boolean escudoP = false;

        if (vidaP < 50 && escudoP==false){ //si la vida es menor que 50 y no tiene escudo se queda asi
            System.out.println("Toma pocion vida");
        }else if (magiaP < 50 && escudoP==false){ //si la vida es mayor que 50, la magia es menor que 50 y no lleva escudo
            System.out.println("Toma pocion magia");
        }else if (vidaP < 50 && magiaP < 50){ //si la vida es menor que 50, la magia es menor que 50 y lleva escudo
            System.out.println("Tomate algo y corre");

        }

    }
}
