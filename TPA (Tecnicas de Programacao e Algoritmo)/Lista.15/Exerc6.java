public class Exerc6 {
    
    public static void main(String[] args) {
        int a[], TAM = 11, i;
        a = new int[TAM];

        for (i = 0; i < TAM; i++) {
            a[i] = (int) Math.pow(2, i); 
        }

        System.out.println("Elementos do vetor A (2^i):");
        for (i = 0; i < TAM; i++) {
            System.out.println("A[" + i + "] = " + a[i]);
        }
    }
}
