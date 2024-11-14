// Ejercicio 10 - Clase 02 - JAVA DEVSENIOR

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        float numero1 = entrada.nextFloat();

        System.out.print("Ingrese el segundo numero: ");
        float numero2 = entrada.nextFloat();

        System.out.print("Ingrese el tercer numero: ");
        float numero3 = entrada.nextFloat();

        float mediaAritmetica = (numero1 + numero2 + numero3) / 3f;

        System.out.println("La media aritmetica de los tres numeros ingresados es: " + mediaAritmetica);

        entrada.close();
    }
}
