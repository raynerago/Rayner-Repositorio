package exercicios12;
import java.util.Scanner;
public class Idade {
    
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
 
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int maisVelho, maisJovem; 
 
      
        System.out.print("Digite a idade da pessoa 1: ");
        int idade = scanner.nextInt();
        maisVelho = idade;
        maisJovem = idade;
 
     
        if (idade <= 15) {
            faixa1++;
        } else if (idade >= 16 && idade <= 30) {
            faixa2++;
        } else if (idade >= 31 && idade <= 45) {
            faixa3++;
        } else if (idade >= 46 && idade <= 60) {
            faixa4++;
        } else {
            faixa5++;
        }
 

        int i = 1;
        while (i < 15) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idade = scanner.nextInt();
 
         
            if (idade > maisVelho) {
                maisVelho = idade;
            }
            if (idade < maisJovem) {
                maisJovem = idade;
            }
 

            if (idade <= 15) {
                faixa1++;
            } else if (idade >= 16 && idade <= 30) {
                faixa2++;
            } else if (idade >= 31 && idade <= 45) {
                faixa3++;
            } else if (idade >= 46 && idade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
 
            i++;
        }
 
        
        int total = faixa1 + faixa2 + faixa3 + faixa4 + faixa5;
 
        
        System.out.println("\nQuantidade de pessoas em cada faixa etária:");
        System.out.println("1ª Faixa (Até 15 anos): " + faixa1 + " - " + ((faixa1 * 100.0) / total) + "%");
        System.out.println("2ª Faixa (De 16 a 30 anos): " + faixa2 + " - " + ((faixa2 * 100.0) / total) + "%");
        System.out.println("3ª Faixa (De 31 a 45 anos): " + faixa3 + " - " + ((faixa3 * 100.0) / total) + "%");
        System.out.println("4ª Faixa (De 46 a 60 anos): " + faixa4 + " - " + ((faixa4 * 100.0) / total) + "%");
        System.out.println("5ª Faixa (Acima de 61 anos): " + faixa5 + " - " + ((faixa5 * 100.0) / total) + "%");
 
       
        System.out.println("\nIdade do mais velho: " + maisVelho);
        System.out.println("Idade do mais jovem: " + maisJovem);
 
        scanner.close();
    }
}