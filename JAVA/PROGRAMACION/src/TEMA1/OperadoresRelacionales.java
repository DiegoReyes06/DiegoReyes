package TEMA1;

public class OperadoresRelacionales {
    public static void main(String[] args) {
        int edad = 15;
        boolean condicion = (edad <= 18); //false 15 > 18
        System.out.println(condicion);

        condicion = (edad == 15); // == comparar el valor de ls variables,  ver si es igual
        System.out.println(condicion);

        condicion = (edad != 20); // 15 != 20 ¿15 es distinto de 20? SI -> true
        System.out.println(condicion);

        condicion = (edad <= 15);
        System.out.println(condicion); //true

        condicion = !(edad >= 20); // ! -> NEGACION (15 >= 20) false
        System.out.println(condicion); //true

        condicion = !(edad != 20); // ¿15 no es distinto de 20? false
        System.out.println(condicion);
    }
}
