package exercicios10;
import java.util.Scanner;
public class EscolhinhaFutebol {

		public static void main(String[] args) {
		
			Scanner Ler= new Scanner(System.in);
			int id;
			System.out.println("Insira a idade do aluno:");
			id= Ler.nextInt();
			
			switch (id) {
			
			case 6:
				System.out.println("Alunos de 6 anos s�o categoria �dente de leite�");
			break;

			case 7:
				System.out.println("Alunos de 7 anos s�o categoria �j�nior�");
			break;
			
			case 8:
				System.out.println("Alunos de 8 anos s�o categoria �j�nior max� ");
			break;
			
			case 9:
				System.out.println("Alunos de 9 anos s�o categoria �j�nior master�");
			break;
			
			case 10:
				System.out.println("Alunos de 10 anos s�o categoria �master� ");
			break;
			
			default:
				System.out.println("A escola n�o admite alunos de outras idades.");
		}
		Ler.close();
	}
}