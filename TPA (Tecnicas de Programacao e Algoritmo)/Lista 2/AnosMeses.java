package exercicios2;
import java.util.Scanner;
public class AnosMeses {
	
	public static void main(String[] args) {
		float dias, anos, meses;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o numero de dias:");
		dias = Ler.nextFloat();
		
		anos = dias/365;
		meses = dias/30;
		
		System.out.println("O numero de dias convertido em anos �: " + anos);
		System.out.println("O numero de dias convertido em meses �: " + meses);
		
		Ler.close();
		
	}
}
