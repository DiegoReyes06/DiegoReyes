package TEMA1EJERCICIOS;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EJERCICIO1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int c = 3;

        //Ejercicio 1
        //a
        System.out.println((a * b) % c);

        //b
        System.out.println(a * b % c);

        //c
        System.out.println(c % b + c * b);

        //d
        System.out.println(a % (a * b * c % (b + c)));

        //e
        System.out.println(b * b + c - b * (a % b));

        //Ejercicio 2
        a = 3;
        b = 4;
        c = 2 * a * b;
        System.out.println("c es = " + 2 * a * b);
        System.out.println("a es = " + a + 2);
        System.out.println("b es = " + (c - a));

        //Ejercicio 3
        int d = 3;
        int e = 7;
        int f = 5;
        int g = 4;

        System.out.println(a > 2);
        System.out.println((b <= 25) && (b > 5));
        System.out.println((c > 6) || (c == d));
        System.out.println((e % 2) == 0 || (e < 50));
        System.out.println(f > a && f > b && f > c);
        System.out.println(g == 3 || g == 4 || g == 5);

        //Ejercicio 4
        System.out.println((3 <= 7) && (7 <= 7));
        System.out.println(!((-8 > 1) && (3 <= 4)));
        System.out.println("Hola" == "Hola ");
        System.out.println((2 <= 5) && (3 >= 6) || (2 < -1));
        System.out.println((2 <= 5) || (3 >= 6) && (2 > -1));

        //Ejercicio 5
        a = 'a';
        System.out.println(a);
        //FUNCIONA y muestra por pantalla el numero determinado por la letra "a"

        //double PI=3.14;
        //System.out.println(PI);
        //NO FUNCIONA debido a  que "PI" es un numero entero y se debe de utilizar "double"

        double PI = 3.14;
        System.out.println(PI);
        //FUNCIONA y muestra  po pantalla el numero "PI"

        boolean adivina = (1 == 4);
        System.out.println(adivina);
        //FUNCIONA y muestra por pantalla la respuesta ante la igualacion de 1 a 4

        //boolean adivina1=(97=='a'==97);
        //System.out.println(adivina);
        //NO FUNCIONA debido al uso multiple de las variables "boolean" y "int"

        boolean adivina1 = (97 == 'a' == true);
        System.out.println(adivina1);
        //FUNCIONA y muestra por pantalla la respuesta  ante la correcta igualacion


        //EJERCICIO 6
        ejercicio6();

    }
    public static void ejercicio6() {

        System.out.println("Hola usuario." + " Bienvenido.");
        String dia = "Lunes";
        System.out.println("Hoy es " + dia);
        int hora = 12;
        System.out.println("Son las " + hora + " en punto.");
        System.out.println("Dentro de 2 horas serán las " + hora + 2 + " en punto");
        System.out.println("Dentro de 2 horas serán las " + (hora + 2) + " en punto");

        //El programa muestra el  dia, y  la hora indicada


        //EJERCICIO 7
        ejercicio7();
    }
    //public static void ejercicio7(){
    //  int n1=50,n2=30;
    //  boolean suma=0;
    //  suma=n1+n2;
    //  System.out.println("LA SUMA ES: " + suma);
    public static void ejercicio7() {
        int n1 = 50;
        int n2 = 30;
        int suma = 0;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);


        //EJERCICIO 8
        n1 = 50;
        n2 = 30;
        suma = 0;
        int n3 = 0;
        suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);
        suma = suma + n3;
        System.out.println(suma);


        //EJERCICIO 9
        ejercicio9();
    }
    public static void ejercicio9(){
        int numero = 2;
        int cuadrado = 0;
        cuadrado = numero * numero;
        System.out.println("EL CUADRADO DE " + numero + " ES: " + cuadrado);


        //EJERCICIO 10
        int num = 5;
        num += num - 1 * 4 + 1;
        System.out.println(num);
        num = 4;
        num %= 7 * num % 3 * 5;
        System.out.println(num);
        //El programa nos muestra el  resultado de las operaciones combinadas


        //EJERCICIO 11
        ejercicio11();
    }
    public static void ejercicio11(){
        int circulo = 0;
        double area = 0;
        double perimetro = 0;
        double radio = 3.6;
        area = 2 * Math.PI * radio;
        System.out.println("EL AREA DEL CIRCULO ES " + area);
        perimetro = 2 * Math.PI * radio;
        System.out.println("EL PERÍMETRO DEL CIRCULO ES " + perimetro);


        //EJERCICIO 12
        ejercicio12();
    }
    public static void ejercicio12(){

        int a;
        int b;
        int variable;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el valor de a");
        a = sc.nextInt();

        System.out.println("Dime el valor de b");
        b = sc.nextInt();

        variable = a;
        a = b;
        b = variable;


        System.out.println(a);
        System.out.println(b);


        //EJERCICIO 13
        ejercicio13();
    }
    public static void ejercicio13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los segundos: ");
        String inputT = sc.nextLine();

        int t = Integer.parseInt(inputT);
        double horas = t / 60; //Para redondear hacia abajo
        double minutos = t % 60;

        System.out.println("El tiempo en minutos es " + minutos);
        System.out.println("El tiempo en horas es " + horas);


        //EJERCICIO 14
        ejercicio14();
    }
        public static void ejercicio14(){
            int dado;

            dado = (int)(Math.random() * (6 + 1 - 1) + 1); // (Mat.random() * (Nºmax + Nºmin - 1) + Nºmin)
            System.out.println(dado);


        //EJERCICIO 15
        ejercicio15();
    }
    public static  void ejercicio15() {
        double devolucion_banco;
        double dinero_inicial;
        double dinero_plazo;
        double dinero_final;
        double dinero_retenido;
        double porcentaje;
        double beneficios;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dinero en el banco: ");
        dinero_inicial = sc.nextDouble();

        porcentaje = 2.75 / 2;

        dinero_plazo = dinero_inicial * porcentaje;
        System.out.println("El dinero obtenido al pasar 6 meses " + dinero_plazo);

        dinero_retenido = dinero_plazo * 18 / 100;
        System.out.println("El dinero que te quita hacienda " + dinero_retenido);

        dinero_final = dinero_plazo - dinero_retenido;
        System.out.println("Los dinero neto tras los 6 meses es " + dinero_final);

        beneficios = dinero_final - dinero_inicial;
        System.out.println("Los beneficios tras los 6 meses son " + beneficios);

        //EJERCICIO 16
        ejercicio16();
    }
    public static void ejercicio16() {
        int cilindro;
        double diametro = 15.5;
        double altura = 42.4;
        double PI = Math.PI;
        double radio = diametro / 2;
        double volumen;
        double area;
        area = (2 * PI * radio * altura) + (2 * PI * (Math.pow(radio, 2)));
        System.out.println("El area del cilindro es:" + area);

        volumen = PI * (Math.pow(radio, 2) + altura);
        System.out.println("El volumen del cilindro es: " + volumen);

        //EJERCICIO 17
        ejercicio17();
    }
    public  static void ejercicio17(){

        int practicaA = (int)(Math.random() * (49 + 1 - 1) + 1);

        System.out.println("El numero random entre 49 y 1 es: " + practicaA);

        int practicaB;

        double practicaC = (Math.random() * (10 + 1 - 1) + 1);
        System.out.println("El numero real es: " + practicaC);

        int practicaD = (int)(Math.random() * ((-50) + (-150) - 1) + (-150));
        System.out.println("El numero  entero es: " + practicaD);

        //EJERCICIO 18


        int a = 10;
        int b = 3;
        int c = 1;
        int d;
        int e;

        float x, y;
        x = a / b;
        //c = (a < b) && c; //No puedo hacer la comparacion de un booleann con un numeo entero.
                          //No puedo asignarle el resultado de una operacion logica a un entero
        d = a + b++;
        e = ++a - b;
        y = (float) a / b;




    }


}

