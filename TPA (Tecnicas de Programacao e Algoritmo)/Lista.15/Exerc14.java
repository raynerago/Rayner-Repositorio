import java.util.*;
public class Exerc14 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		int c[]=new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Insira o " +(i+1)+ "° valor do Vetor A: ");
			a[i]=ler.nextInt();
		}
		for (int i=0; i<10; i++) {
			System.out.println( "Insira o " +(i+1)+ "° valor do Vetor B: ");
			b[i]=ler.nextInt();
		}
		for (int i=0; i<10; i++) {
			if (a[i]>b[i]) {
				c[i]++;
			}else if (a[i]==b[i]) {
				c[i]=0;
			}else if (a[i]<b[i]) {
				c[i]=-1;
			}
		}
		for (int i=0; i<10; i++) {
			System.out.println("O " +(i)+ "° valor do Vetor C é: " +c[i]);
		}
		
		
	}
}
