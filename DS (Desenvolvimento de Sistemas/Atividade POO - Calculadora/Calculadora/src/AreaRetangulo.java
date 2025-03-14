import java.util.*;
public class AreaRetangulo {

	public double baseRetangulo;
	public double alturaRetangulo;
	public double resultadoAreaRetangulo;
	
	public void calcularRetangulo() {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite a base do retangulo: ");
		baseRetangulo = Ler.nextDouble();
		
		System.out.println("Digite a altura do retangulo: ");
		alturaRetangulo = Ler.nextDouble();
		
		resultadoAreaRetangulo = baseRetangulo * alturaRetangulo;
		System.out.println("A area do retângulo é: " + resultadoAreaRetangulo);
	}
	
}
