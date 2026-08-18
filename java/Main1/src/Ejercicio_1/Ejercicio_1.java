public class Ejercicio_1 
{

    public static int sumaArreglo(int[] arreglo)
    {
        int suma = 0;

        for (int numero : arreglo)
        {
            suma += numero;
        }

        return suma;
    }

    public static void main(String[] args)
    {
        int[] numeros = {1, 2, 3, 4, 5};

        int resultado = sumaArreglo(numeros);

        System.out.println("La suma es: " + resultado);
    }
}
