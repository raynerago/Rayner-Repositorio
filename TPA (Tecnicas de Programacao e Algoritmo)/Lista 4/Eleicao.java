package exercicios4;
import java.util.Scanner;
public class Eleicao {

	public static void main(String[] args) {
		int id, an, ae;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu ano de nascimento:");
		an = Ler.nextInt();
		
		System.out.println("Digite o ano da elei��o:");
		ae = Ler.nextInt();
		
		id = ae - an;
		
		if (id < 16) {
			System.out.println("Voc� ter� " + id + " anos, e n�o poder� votar.");
		}else {
			System.out.println("Voc� ter� " + id + " anos, e poder� votar.");
		}
		
		Ler.close();
	}
}
