package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // creo el arreglo para los 10 numeros
        int[] numeros = new int[10];
        
        System.out.println("ingresa 10 numeros en orden ascendente:");
        
        for (int i = 0; i < numeros.length; i++) {
            while (true) {
                System.out.print("posicion [" + i + "]: ");
                int ingreso = scanner.nextInt();
                
                // si es el primero o si es mayor al anterior, lo guardo
                if (i == 0 || ingreso > numeros[i - 1]) {
                    numeros[i] = ingreso;
                    break; // salgo del while para pasar al siguiente numero
                } else {
                    System.out.println("tiene que ser mayor a " + numeros[i - 1] + ", intenta de nuevo");
                }
            }
        }
        
        // imprimo como quedo el arreglo
        System.out.print("arreglo final: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
