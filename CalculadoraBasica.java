// Ejercicio 7 - Clase 02 - JAVA DEVSENIOR

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer numero: ");
        var numero1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        var numero2 = entrada.nextInt();

        System.out.println("La Suma de los numeros " + numero1 + " + " + numero2 + " es: " + (numero1 + numero2));
        System.out.println("La Resta de los numeros " + numero1 + " - " + numero2 + " es: " + (numero1 - numero2));
        System.out.println("La Multiplicación de los numeros " + numero1 + " * " + numero2 + " es: " + (numero1 * numero2));
        System.out.println("La División de los numeros " + numero1 + " / " + numero2 + " es: " + (numero1 / numero2));
        entrada.close();
    }
}
