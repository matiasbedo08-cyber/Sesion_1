package Ejercicio_6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese las horas: ");
        int horas = entrada.nextInt();

        System.out.print("Ingrese los minutos: ");
        int minutos = entrada.nextInt();

        System.out.print("Ingrese los segundos: ");
        int segundos = entrada.nextInt();

        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;

        System.out.println("El equivalente en segundos es: " + totalSegundos);

        entrada.close();
    }
}
