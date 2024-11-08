import java.util.Scanner;
public class Exerc12{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int a[]= new int[10];
			
		for (int i=0; i<10; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do Vetor A:");
			a[i]=ler.nextInt();
		}
		
		boolean palindromo = true;
		int tamanho = 9;
		
		for(int i=0; i<tamanho / 2; i++)
			if (a[i]!=a[tamanho -i]) {
				palindromo=false;
				break;
			}
			if (!palindromo) {
				System.out.println("Este vetor não é um palíndromo");
			}else {
				System.out.println("Este Vetor é um palíndromo");
			}
			
	}
}
