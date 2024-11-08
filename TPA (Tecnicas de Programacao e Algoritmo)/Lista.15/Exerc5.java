import java.util.Scanner;

public class Exerc5 {

    public static void main(String[] args) {
        int a[], TAM = 10, i, j;
        Scanner Ler = new Scanner(System.in);

        a = new int[TAM];

        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < TAM; i++) {
            a[i] = Ler.nextInt();
        }

        System.out.println("\nRelação dos divisores para cada elemento do vetor:");

        for (i = 0; i < TAM; i++) {
            System.out.println("Divisores de " + a[i] + ":");

            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    System.out.print(j + " ");
                }
            }
        }

        Ler.close();
    }
}
