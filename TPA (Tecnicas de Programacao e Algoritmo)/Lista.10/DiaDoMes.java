package exercicios10;
import java.util.Scanner;
public class DiaDoMes {
	 
	public static void main(String[] args) {
		int mes;
		Scanner Ler =new Scanner(System.in);
		System.out.println("Digite o m�s (Em n�meros) de sua prefer�ncia: ");
		mes=Ler.nextInt();
		switch (mes) {
		
		case 1: 
			System.out.println("O m�s 1 (Janeiro) possui um total de 31 dias");
		break;
		
		case 2:
			System.out.println("O m�s 2 (Fevereiro) possui um total de 28 dias");
		break;
		
		case 3:
			System.out.println("O m�s 3 (Mar�o) possui um total de 31 dias");
		break;
		
		case 4:
			System.out.println ("O m�s 4 (Abril) possui um total de 30 dias");
		break;
		
		case 5: 
			System.out.println("O m�s 5 (Maio) possui um total de 31 dias");
		break;
		
		case 6:
			System.out.println("O m�s 6 (Junho) possui um total de 30 dias");
		break;
		
		case 7: 
			System.out.println("O m�s 7 (Julho) possui um total de 31 dias");
		break;
		
		case 8:
			System.out.println("O m�s 8 (Agosto) possui um total de 31 dias");
		break;
		
		case 9:
			System.out.println("O m�s 9 (Setembro) possui um total de 30 dias");
		break;
		
		case 10:
			System.out.println ("O m�s 10 (Outubro) possui um total de 31 dias");
		break;
		
		case 11: 
			System.out.println("O m�s 11 (Novembro) possui um total de 30 dias");
		break;
		
		case 12:
			System.out.println("O m�s 12 (Dezembro) possui um total de 31 dias");
		break;
		
		default:
			System.out.println("Este m�s n�o existe.");
		}
		
		Ler.close();
	}

}

