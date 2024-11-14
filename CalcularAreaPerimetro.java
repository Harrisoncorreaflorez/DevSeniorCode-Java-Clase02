// Ejercicio 8 - Clase 02 - JAVA DEVSENIOR

import java.util.Scanner;

public class CalcularAreaPerimetro { //Este programa calcula el area y el perimetro de un RECTANGULO
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor ingrese la longitud del rectangulo (Altura): ");
        int longitud = entrada.nextInt();

        System.out.print("Por favor ingrese el ancho del rectangulo (Base): ");
        int ancho = entrada.nextInt();

        int areaRectangulo = longitud * ancho;
        int perimetroRectangulo = (longitud + ancho) * 2;

        System.out.println("El area del rectango es: " + areaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);
        entrada.close();

    }
    
}
