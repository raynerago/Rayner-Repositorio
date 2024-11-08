import java.util.Scanner;
public class Exerc7 {
    
    public static void main(String[] args) {
        int a[], b[], TAM = 15, i, j;
        Scanner Ler = new Scanner(System.in);

        a = new int[TAM];
        b = new int[TAM];

        System.out.println("Digite 15 números inteiros:");
        for (i = 0; i < TAM; i++) {
            a[i] = Ler.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            int fatorial = 1;
            for (j = 1; j <= a[i]; j++) {
                fatorial *= j;
            }
            b[i] = fatorial;
        }

        System.out.println("\nVetor A e seus respectivos fatoriais no vetor B:");
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i] + " -> B[" + i + "] = " + b[i]);
        }

        Ler.close();
    }
}
