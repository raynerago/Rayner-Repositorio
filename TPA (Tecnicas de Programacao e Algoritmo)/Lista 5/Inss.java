package exercicios5;
import java.util.Scanner;
public class Inss {

	public static void main(String[] args) {
		double salB, salL, inss;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o seu salario:");
		salB = Ler.nextDouble();
		
		if (salB >= 2500) {
			inss = salB *0.11;
			salL = salB - inss;
			System.out.println("O total de inss descontado �: "+ inss);
			System.out.println("O Salario ap�s o desconto de inss �: "+ salL);
		}else {
			inss = salB *0.09;
			salL = salB - inss;
			System.out.println("O total de inss descontado �: "+ inss);
			System.out.println("O Salario ap�s o desconto de inss �: "+ salL);
		}
		
		Ler.close();
	}
}
