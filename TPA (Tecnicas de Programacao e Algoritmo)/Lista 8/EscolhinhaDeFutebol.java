package exercicios8;
import java.util.Scanner;
public class EscolhinhaDeFutebol {

		public static void main(String[] args) {
			int id;
			Scanner Ler= new Scanner(System.in);
			System.out.println("Digite a idade do aluno");
			id= Ler.nextInt();
			switch (id) {
		
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("Esse aluno �: Dente de leite");
			break;
		
			case 7:
				System.out.println("Esse aluno �: J�nior");
			break;
		
			case 8:
				System.out.println("Esse aluno �: J�nior Max");
			break;
		
			case 9:
				System.out.println("Esse aluno �: J�nior Master");
			break;
		
			case 10:
				System.out.println("Esse aluno �: Master");
			break;
		
			default:
				System.out.println("A escola n�o admite alunos de outras idades");
			}
			Ler.close();
		}
}