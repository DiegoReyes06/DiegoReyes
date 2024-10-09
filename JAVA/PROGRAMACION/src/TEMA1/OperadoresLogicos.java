package TEMA1;

import org.w3c.dom.ls.LSOutput;

public class OperadoresLogicos {
    public static void main(String[] args) {

        //OPERADORES LOGICOS -> operadores de  logica booleana
        // ! -> NEGACION (true -> false, false -> true)
        // && -> Y LOGICO (true si los dos valores son true, sino false)
        // ||-> O LOGICO (false si los dos valores son false, sino true)

        //Y LOGICO
        int edad = 15;
        char sexo = 'a';

        boolean condicion = (edad == 15) && (sexo == 'h'); //true && true = true
        System.out.println(condicion);

        condicion = (edad >= 18) && (sexo == 'h'); //false && true = false
        System.out.println(condicion);

        condicion = (edad >= 16) && (sexo == 'm'); //false && false = false

        //O LOGICO
        condicion = (edad == 15) || (sexo == 'h'); //true || true = true
        System.out.println(condicion);

        condicion = (edad > 20) || (sexo == 'h'); //false || true = true
        System.out.println(condicion);

        condicion = (edad >= 25) || (sexo == 'm'); //false || false = false

        //MECLAR ! Y, O
        condicion = !((edad >= 15) && (sexo == 'm')); //!(true) && (false) = true
        System.out.println(condicion);

        condicion = (edad >= 15) && (!(sexo == 'm')); //(true) && (!(false)) = true
        System.out.println(condicion);

        condicion = !((edad < 10) || (sexo == 'c')); // !((false) || (false)) =!(false) -> true
        System.out.println(condicion);

        condicion = !((edad < 20) || (sexo == 'h')); // !((true) || (true)) = !(true) -> false
        System.out.println(condicion);
    }
}
