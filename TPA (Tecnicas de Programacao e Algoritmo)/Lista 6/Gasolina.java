package exercicios6;
import java.util.Scanner;
public class Gasolina {
	
	public static void main(String[] args) {
		double km, c, r;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida em quilom�tros:");
		km = Ler.nextDouble();
		System.out.println("Digite o total de combustivel gasto durante o percurso");
		c = Ler.nextDouble();
		
		r = km/c;
		
		if (r >= 10) {
			System.out.println("Econ�mico");
		
		}else {
			System.out.println("N�o econ�mico");
		}
		
		Ler.close();
	}

}
