// Ejercicio 9 - Clase 02 - JAVA DEVSENIOR

import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor ingrese el valor de temperatura en °C para la conversión a °F y °K: ");
        float celsius = entrada.nextFloat();
        
        float fahrenheit = (celsius * 9f/5f) + 32F;
        float kelvin = celsius + 273.15f;

        System.out.println("La conversión de " + celsius + " °C" + "a Fahrenheit es: " + fahrenheit + " °F");
        System.out.println("La conversión de " + celsius + " °C" + "a Kelvin es: " + kelvin + " °K");

        entrada.close();
    }
}
