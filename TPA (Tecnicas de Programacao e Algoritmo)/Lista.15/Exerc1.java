import java.util.Scanner;
public class Exerc1 {
    
	public static void main(String[] args) {
        int a[], b[], TAM = 20, inicio = 0, fim = TAM - 1, i;
    	Scanner Ler = new Scanner(System.in);
    	
    	a = new int [TAM];
    	b = new int [TAM];
        
    	System.out.println("Digite 20 números:");
        for (i = 0; i < TAM; i++) {
        a[i] = Ler.nextInt();
        }
       
        for (i = 0; i < TAM; i++) {
            if (a[i] % 2 == 0) {
                b[inicio] = a[i];
                inicio++;
            } else {
                b[fim] = a[i];
                fim--;
            }
        }

        System.out.println("Vetor B (pares seguidos de ímpares):");
        for (i = 0; i < TAM; i++) {
            System.out.print(b[i] + " ");
        }
        Ler.close();
    }
}
