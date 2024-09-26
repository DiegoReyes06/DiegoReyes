package TEMA1;

public class PrecioIVA {
    public static void main(String[] args) {
        double precioProducto = 69.95;
        double precioConIVA = 0.0;
        double precioFinal = 0.0;

        precioConIVA = 21 * precioProducto / 100;
        precioFinal = precioProducto + precioConIVA;

        System.out.println("El precio con IVA es " + precioFinal);
    }
}






