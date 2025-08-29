import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Primer solucion empleando dos arreglos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.print("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Ingerese un número entero: ");
        int k = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < n && !encontrado; i++) {
            for (int j = i; j < n && !encontrado; j++) {
                if (A[i] + A[j] == k) {
                    System.out.println("Par encontrado: " +A[i]+"+"+A[j]+"= "+k);
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No existe ningún par con suma " + k);
        }

        scanner.close();
    }
}