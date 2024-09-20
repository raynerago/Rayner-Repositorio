
import java.util.Scanner; 
public class Idade {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int id,i,anoA,anoN, velho,novo;
	velho = -100;
	novo = 100;
	
		for (i = 0; i <= 10; i++) {
				System.out.println("Digite o ano atual : ");
			anoA = ler.nextInt();
				System.out.println("Digite o seu ano de nascimento :");
			anoN = ler.nextInt();
			id = anoA - anoN;
				System.out.println( " Sua idade é :"  +  id);
				

	 if (id > velho) {
		velho = id;
	} if (id < novo) {
		novo = id;
	}

		}
	
		System.out.println("Essa é a idade da pessoa mais velha :" + velho);
		System.out.println("Essa é a idade do mais novo :"  + novo);
		
}
}
