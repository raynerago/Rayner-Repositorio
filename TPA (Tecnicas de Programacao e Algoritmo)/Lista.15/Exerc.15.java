import java.util.Scanner;
public class Exerc15 {

    public static void main(String[] args) {
        int a[], b[], c[], TAM = 10, i;
        Scanner Ler = new Scanner(System.in);

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        System.out.println("Digite 10 números inteiros para o vetor A:");
        for (i = 0; i < TAM; i++) {
            a[i] = Ler.nextInt();
        }

        System.out.println("\nDigite 10 números inteiros para o vetor B:");
        for (i = 0; i < TAM; i++) {
            b[i] = Ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            if (a[i] > b[i]) {
                c[i] = 1;
            } else if (a[i] == a[i]) {
                c[i] = 0;
            } else {
                c[i] = -1;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Vetor A:");
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }

        System.out.println("\nVetor B:");
        for (i = 0; i < TAM; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }

        System.out.println("\nVetor C (Resultados):");
        for (i = 0; i < TAM; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }

        Ler.close();
    }
}
