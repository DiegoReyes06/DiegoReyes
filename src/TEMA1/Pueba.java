package TEMA1;

public class Pueba {
    public static void main(String[] args) {
        String nombre = "Diego"; //nombre es una variable tipo cadena
        int edad = 30; //edad es  una variable de tipo entero

        System.out.println("Tu nombre es ");
        System.out.println(nombre);

        System.out.println("Tu nombre es " + nombre);

        System.out.println("Tu edad es " + edad); //Une cadenas

        System.out.println("Tu edad es " + (edad + 3)); //Primero suma, luego une cadenas

    }
}
