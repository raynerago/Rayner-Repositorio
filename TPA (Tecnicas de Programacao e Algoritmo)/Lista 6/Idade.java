package exercicios6;
import java.util.Scanner;
public class Idade {

	public static void main(String[] args) {
		int anoA, anoN, id;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		anoA = Ler.nextInt();
		System.out.println("Digite o ano de nascimento: ");
		anoN = Ler.nextInt();
		
		id = anoA - anoN;
		
		if (id < 10 ) {
			System.out.println("Criança");
		}else if (id < 18) {
			System.out.println("Adolescente");
		}else if (id < 60) {
			System.out.println("Adulto");
		}else {
			System.out.println("Idoso");
		}
		
		
		Ler.close();
	}
}
