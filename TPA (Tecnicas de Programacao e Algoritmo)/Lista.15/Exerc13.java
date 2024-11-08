import java.util.*;
public class Exerc13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[]=new int[10];
		int b[]=new int[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Insira o " +(i+1)+ "° valor do vetor A");
			a[i]=ler.nextInt();
		}
		for (int i=0; i<10; i++) {
			int parimpar = a[i]%2;
			if (parimpar==0) {
				b[i]++;
			}else {
				b[i]=0;
			}
		}
		for (int i=0; i<10; i++) {
			System.out.println("O " +(i+1)+ "° valor do Vetor B é: " +b[i]);
		}
		
	}	
}
	
