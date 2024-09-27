package prova;
import java.util.*;
public class questao5 {
	public static void main(String[] args) {
		Scanner ler=new Scanner(System.in);
		     double media=0;
		     int  i=1,  maior= -1000,  renda, n=0;
		   
		     while (i<=40) {
		     System.out.println("Insira a renda do aluno:");
		     renda=ler.nextInt();
		     media= media+renda;
		    
		     
		     	i=i+1;
		     	
		     	  if (renda >= maior) {
				        maior=renda;
				        n++;
				         
		     	  }
		     }
		     
		     
		     
		     System.out.println("A soma da renda dos alnos é: " +media);
		     media=media/i;
		     System.out.println("A media de renda da sala é: " +media);
		     System.out.println("A renda mais alta é: " +maior);
		     System.out.println("O numero do aluno com a maior renda é:" +n);
	}		

	
}


