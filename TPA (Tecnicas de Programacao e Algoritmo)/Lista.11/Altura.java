package Exercicios11;
public class Altura {

	public static void main(String[] args) {
		double altJ = 134.0, altP = 145.0;
		
		int i = 0;
		
		while (altJ <= altP) {
			
			altJ += 2.5;
			altP += 2.0;
		
			i++;
		}
		System.out.println("Jo�o ira ultrapassar Pedro na altura em " + i + " anos");
		System.out.println("Altura final de Jo�o: " + altJ);
		System.out.println("Altura final de pedro: " + altP);
	}

}