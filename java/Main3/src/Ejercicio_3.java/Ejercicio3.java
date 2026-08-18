package Ejercicio_3

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        // un arreglo de 6 espacios para las caras del dado
        int[] caras = new int[6];
        Random random = new Random();
        
        // lanzo el dado 20000 veces
        for (int i = 0; i < 20000; i++) {
            // me da un numero entre 0 y 5
            int resultado = random.nextInt(6);
            
            // le sumo 1 a la cara que salio
            caras[resultado]++;
        }
        
        // muestro cuantas veces cayo cada cara
        for (int i = 0; i < caras.length; i++) {
            System.out.println("cara " + (i + 1) + ": " + caras[i] + " veces");
        }
    }
}
