def suma_arreglo(arreglo):
    suma = 0

    for numero in arreglo:
        suma += numero

    return suma


numeros = [1, 2, 3, 4, 5]

resultado = suma_arreglo(numeros)

print("La suma es:", resultado)
