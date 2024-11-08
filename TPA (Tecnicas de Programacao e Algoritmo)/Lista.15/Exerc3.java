import java.util.Scanner;

public class Exerc3 {

    public static void main(String[] args) {
        int a[], TAM = 10, i, n;
        Scanner Ler = new Scanner(System.in);

        a = new int[TAM];

        
        System.out.println("Digite 10 números inteiros:");
        for (i = 0; i < TAM; i++) {
            a[i] = Ler.nextInt();
        }

        System.out.println("\nVerificação dos números primos:");

        for (i = 0; i < TAM; i++) {
            boolean primo = true;

            if (a[i] <= 1) {
                primo = false; 
            } else {
                for (n = 2; n * n <= a[i]; n++) {
                    if (a[i] % n == 0) {
                        primo = false;
                        break;
                    }
                }
            }

            System.out.println(A[i] + (primo ? " é primo." : " não é primo."));
        }

        Ler.close();
    }
}
