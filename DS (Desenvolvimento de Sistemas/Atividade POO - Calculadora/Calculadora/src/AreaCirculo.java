import java.util.Scanner;
public class AreaCirculo {

	public double raioCirculo;
	public double pi = Math.PI;
	public double resultadoAreaCirculo;
	
	public void calculoCirculo() {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira o valor do raio do circulo: ");
		raioCirculo = Ler.nextDouble();
		
		resultadoAreaCirculo = pi * (raioCirculo * raioCirculo);
		System.out.println("A area do circulo é: " + resultadoAreaCirculo);
		
		
	}
	
	
}
