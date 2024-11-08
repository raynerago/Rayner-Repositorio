import java.util.*;
public class Exerc10 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int	a[]= new int[10];
		int	b[]= new int[10];
		int c[]= new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Insira o valor " +(i+1)+ " do vetor A");
			a[i]=ler.nextInt();
		}
		for (int i=0; i<10; i++) {
			System.out.println("Insira o valor " +(i+1)+ " do vetor B");
			b[i]=ler.nextInt();
		}
		
		int diferenca=0;
		
		for (int i=0; i<10; i++) {
			boolean existeemB = false;
			for (int j=i; j<10; j++) {
				if (a[i]==b[j]) {
					existeemB = true;
					break;
				}
					
			} if (!existeemB) {
				c[diferenca]=a[i];
				diferenca++;
			}
				
		}for (int i=0; i<diferenca; i++) {
			System.out.println("O " +(i)+ " valor do Vetor C é:" + c[i]);
		}
		
	}
}
