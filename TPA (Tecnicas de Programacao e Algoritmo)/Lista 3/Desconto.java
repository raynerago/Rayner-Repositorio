package exercicios3;
import java.util.Scanner;
public class Desconto {

	public static void main(String[] args) {
		float p, pn, porc, desc, calc;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o pre�o total do produto:");
		p = Ler.nextFloat();
		
		System.out.println("Insira o desconto do produto:");
		porc = Ler.nextFloat();
		
		calc = porc/100;
		desc = p*calc;
		pn = p - desc;
		
		System.out.println("O pre�o do produto com desconto �: " + pn);
		
		Ler.close();
		
	}
}
