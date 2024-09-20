package Exercicios11;
public class Tabuada10 {
 
	public static void main(String[] args) {
		int i = 1, t = 1, r;
		
		while (i<=10) {
			int ii = 1;
			System.out.println("Tabuada do " + t);
			
			while (ii<=10) {
			r = i * ii;
			
			System.out.println(i +"x"+ ii+"= "+ r);
			
			ii+=1;
			}
		
		t+=1;
		i+=1;
		
		}
	}
}