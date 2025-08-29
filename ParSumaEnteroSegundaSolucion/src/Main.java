import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        //Segunda solucion usando Hash
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.print("Ingrese los elementos del arreglo: " );
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Ingrese un número entero: ");
        int k = scanner.nextInt();

        HashSet<Integer> diccionario = new HashSet<>();
        boolean encontrado = false;

        for (int elemento : A) {
            int complemento = k - elemento;
            if (elemento + elemento == k) {
                System.out.println("Par encontrado: "+elemento+"+"+elemento+"= "+k);
                encontrado = true;
                break;
            }

            if (diccionario.contains(complemento)) {
                System.out.println("Par encontrado: "+elemento+"+"+complemento+"= "+k);
                encontrado = true;
                break;
            }
            diccionario.add(elemento);
        }

        if (!encontrado) {
            System.out.println("No existe ningún par con suma " + k);
        }
        scanner.close();
    }
}

