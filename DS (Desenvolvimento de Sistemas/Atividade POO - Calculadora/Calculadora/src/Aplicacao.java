import java.util.Scanner;
public class Aplicacao {
	public static void main(String[] args) {
		Scanner Ler = new Scanner (System.in);
		int escolha;
		
		for (int resposta = 1; resposta == 1; ) {
		System.out.println("Se Deseja calcular a área de um tri�ngulo, digite 1;\n Se Deseja calcular a área de um círculo, digite 2;\nSe Deseja calcular a �rea de um ret�ngulo, digite 3.\n");
		
		escolha = Ler.nextInt();
		
		switch (escolha) {
		
		case 1:
		AreaTriangulo areaTriangulo;
		areaTriangulo = new AreaTriangulo();
		
		System.out.println("Voc� escolheu calcular a �rea do tri�ngulo\n");
		areaTriangulo.calculoTriangulo();
		break;
		
		case 2:
		AreaCirculo areaCirculo;
		areaCirculo = new AreaCirculo();
		
		System.out.println("Voc� escolheu calcular a �rea do c�rculo\n");
		areaCirculo.calculoCirculo();
		break;
		
		case 3:
		AreaRetangulo areaRetangulo;
		areaRetangulo = new AreaRetangulo();
		
		System.out.println("Voc� escolheu calcular a �rea do re�ngulo\n");
		areaRetangulo.calcularRetangulo();
		break;
		
		default:
			System.out.println("Alternativa invalido\n");
		break;
			
		}
		System.out.println("Deseja fazer mais calculos?\n(Digite 1 para sim e 2 para n�o.)");
		resposta = Ler.nextInt();
		
		}
		
		
	}

}