package exercicios6;
import java.util.Scanner;
public class Raiz {

	public static void main(String[] args) {
		double a, b, c, del, raiz, x1, x2;
		Scanner Ler = new Scanner(System.in);
		
		System.out.println("Digite o valor a A");
		a = Ler.nextDouble();
		System.out.println("Digite o valor a b");
		b = Ler.nextDouble();
		System.out.println("Digite o valor a c");
		c = Ler.nextDouble();
		
		del = (b*b)-4*(a*c);
		
		if (del < 0)  {
			System.out.println("a raiz da equa��o � inexistente");
		}else if (del == 0){
			raiz = (-b- Math.sqrt(del))/(2*a);
			System.out.println("Sua equa��o s� cont�m uma raiz" + raiz);
		}else {
			x1 = (-b+ Math.sqrt(del))/(2*a);
			x2 = (-b- Math.sqrt(del))/(2*a);
			System.out.println("As raizes da sua equa��es s�o: "+ x1 +","+ x2  );
		}
		
		Ler.close();
	}
	
}
