// Ejercicio 5 - Clase 02 - JAVA DEVSENIOR

public class CalcularCostoOrdenador {
    public static void main(String[] args) {
        int costoPc = 660;
        int descuento = 10;
        int totalPagar = costoPc - (costoPc * descuento / 100);
        System.out.println("El total a pagar es: " + totalPagar);
    }
}
