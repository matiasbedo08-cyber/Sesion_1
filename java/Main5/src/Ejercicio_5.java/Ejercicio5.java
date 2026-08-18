package Ejercicio_5;

import java.util.Scanner;

public class Ejercicio5 {

    public static double calcularCargo(double horas) {
        double cargo;

        if (horas <= 1) {
            cargo = 3.00;
        } else {
            cargo = 3.00 + (horas - 1) * 0.50;
        }

        if (cargo > 12.00) {
            cargo = 12.00;
        }

        return cargo;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero de horas: ");
        double horas = teclado.nextDouble();

        double cargo = calcularCargo(horas);

        System.out.println("El cargo del estacionamiento es: S/" + cargo);
    }
}
