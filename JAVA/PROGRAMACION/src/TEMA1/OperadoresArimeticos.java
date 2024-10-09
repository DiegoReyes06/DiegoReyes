package TEMA1;

import org.w3c.dom.ls.LSOutput;

public class OperadoresArimeticos {
    public static void main(String[] args) {
        int numero = 0;
        numero++; //numero = numero + 1 (se le suma 1)

        System.out.println(numero);

        numero--; //numero = numero - 1 (se le resta 1)

        System.out.println(numero);


        //SUMA Y ASIGNACION
        int cantidad = 10;
        cantidad += 5; //cantidad = cantidad + 5 (se le suma 5)

        System.out.println(cantidad);


        //RESTA Y ASIGNACION
        cantidad -= 10; //cantidad = cantidad - 5 (se le resta 5)

        System.out.println(cantidad);


        //MULTIPLICACION Y ASIGNACION
        cantidad *= 5; //cantidad = cantidad * 5 (se multiplica por 5)

        System.out.println(cantidad);


        //DIVISION Y ASIGNACION
        cantidad /= 5; //cantidad = cantidad / 5 (se divide entre 5)

        System.out.println(cantidad);
    }
}
