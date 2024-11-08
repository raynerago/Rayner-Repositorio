import java.util.*;
public class Exerc8 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int a[], b[], j, i;
		a= new int[10];
		b= new int[10];
		
		
		for (j=0; j<10; j++ ) {
			 System.out.println("Escreva o numero desejado:");
			 
			 a[j]= ler.nextInt();
		}
		
			for (i=0; i<10; i++) {
				b[i]=0;
				for (j=i; j<10; j++) {
				 b[i]= b[i] + a[j];
				
			}
				System.out.println(b[i]);
		}
		
		}
	}

