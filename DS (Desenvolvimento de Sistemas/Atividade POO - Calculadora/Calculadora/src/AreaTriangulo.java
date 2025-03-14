import java.util.Scanner;

public class AreaTriangulo {
	
	public double alturaTriangulo;
	public double baseTriangulo;
	public double resultadoAreaTriangulo;
	
	public void calculoTriangulo() {
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Insira a altura do Triangulo: ");
		alturaTriangulo = Ler.nextDouble();
		
		System.out.println("Insira a base do Triangulo: ");
		baseTriangulo = Ler.nextDouble();
		
		resultadoAreaTriangulo = (alturaTriangulo * baseTriangulo) /2;
		System.out.println("A area do triangulo é: " + resultadoAreaTriangulo);
		
	}

}
