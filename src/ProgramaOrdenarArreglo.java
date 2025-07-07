/*
Leer 10 números enteros desde el teclado para llenar
un arreglo de 10 elementos. Luego debemos mostrarlos
en el siguiente orden: el último, el primero, el
penúltimo, el segundo, el antepenúltimo, el tercero,
y así sucesivamente.
 */


import java.util.Scanner;

public class ProgramaOrdenarArreglo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i, arreglo[];
        arreglo = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            arreglo[i] = scanner.nextInt();
        }

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (i = 0; i <= 4; i++) {
            System.out.println(arreglo[9 - i]); // y el i-ésimo por el final
            System.out.println(arreglo[i]); // mostramos el i-ésimo número por el principio
        }
    }
}