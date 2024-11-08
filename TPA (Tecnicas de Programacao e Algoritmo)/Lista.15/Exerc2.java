import java.util.Scanner;
public class Exerc2 {
	
	public static void main(String[] args) {
		int a[], TAM = 5, nc, i, n, r = 0;
		Scanner Ler = new Scanner(System.in);
		
		a = new int [TAM];
		
		System.out.println("Digite 5 numeros cujo deseja saber as respectivas tabuadas:");
		
		for (i = 0; i < TAM; i++) {
			a[i] = Ler.nextInt();
		}
		System.out.println();
		System.out.println("Quantos numeros deseja que sejam calculados sua tabuada?");
		nc = Ler.nextInt();
		
		for (i = 0; i < TAM; i++) {
			System.out.println("Tabuada do " +a[i]+ ":");
			
			for (n = 1; n <= nc; n++) {
			r = a[i] * n;
			System.out.println(a[i] +" x "+ n +" = "+ r);
			}
			System.out.println();
		}
		Ler.close();
	}
}
