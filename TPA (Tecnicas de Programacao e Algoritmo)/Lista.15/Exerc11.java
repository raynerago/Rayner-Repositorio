import java.util.*;
public class Exerc11 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		
		int a[]=new int[10];
		
		
		for (int i=0; i<10; i++) {
			System.out.println("Escreva o " +(i+1)+ "° valor do vetor A");
			a[i]=ler.nextInt();
			
		} System.out.println("Digite o número que quer encontrar no vetor A");
			int valorX=ler.nextInt();
			
			boolean encontrado=false;
			
		for (int i=0; i<10; i++) {
			if (a[i]==valorX) {
				encontrado=true;
			}
		}
		if (encontrado) {
			System.out.println("O valor " +valorX+ " está presente no vetor A");
		}else {
			System.out.println("O valor " +valorX+ " não está no vetor A");
		}
	} 
}
