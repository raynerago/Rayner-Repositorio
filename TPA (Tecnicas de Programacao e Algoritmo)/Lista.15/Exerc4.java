import java.util.Scanner;

public class Exerc4 {
    
    public static void main(String[] args) {
        int a[], TAM = 10, i, j;
        Scanner Ler = new Scanner(System.in);

        a = new int[TAM];

        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < TAM; i++) {
            a[i] = Ler.nextInt();
        }

        System.out.println("\nRelação dos pares de 0 até cada elemento do vetor:");

        
        for (i = 0; i < TAM; i++) {
            System.out.println("Elementos pares de 0 até " + a[i] + ":");
            
            for (j = 0; j <= a[i]; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println(); 
        }

        Ler.close();
    }
}
