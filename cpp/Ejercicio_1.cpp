#include <iostream>

using namespace std;

int suma_arreglo(int arreglo[], int tamaño)
{
    int suma = 0;

    for (int i = 0; i < tamaño; i++)
    {
        suma += arreglo[i];
    }

    return suma;
}

int main()
{
    int numeros[] = {1, 2, 3, 4, 5};

    int resultado = suma_arreglo(numeros, 5);

    cout << "La suma es: " << resultado << endl;

    return 0;
}
