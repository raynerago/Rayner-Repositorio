import java.util.*;
public class Exerc9 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		int a[], b[], c[], i, j, k;
		a= new int[10];
		b= new int[10];
		c= new int[10];
		
		for (i=0; i<10; i++) {
			System.out.println("Insira o valor do vetor A:");
			a[i]=ler.nextInt();
			
		}
		for (i=0; i<10; i++) {
			System.out.println("Insira o valor do vetor B:");
			b[i]=ler.nextInt();
		}
		for (i=0; i<10; i++) {		
		  for (j=i; j<10; j++) {
				if (a[i]==b[j]) {
					c[i]=a[i];
				}
			
		}	
		}
		 for (i=0; i<10; i++) {
			 System.out.println("O " +i+ " valor do vetor C é: " +c[i]);
		 }
	}
}



