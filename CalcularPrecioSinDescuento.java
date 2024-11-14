// Ejercicio 6 - clase 02 JAVA DEVSENIOR

public class CalcularPrecioSinDescuento {
    public static void main(String[] args) {
        int valorPagado = 34;
        int descuento = 15;
        Float valorSinDescuento =  valorPagado / ((100f - descuento) / 100);
        System.out.println("El valor sin descuento es de: " + valorSinDescuento);

    }
}
