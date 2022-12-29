import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas valores vai ter cada vetor ? ");
        int numeroInputs = input.nextInt();

        int[] vetorA = new int[numeroInputs];
        int[] vetorB = new  int[numeroInputs];
        int[] vetorC = new int[numeroInputs];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i<vetorA.length;i++){
            vetorA[i] = input.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < vetorB.length;i++){
            vetorB[i] = input.nextInt();
        }
        System.out.println("VETOR RESULTANTE");
        for(int i = 0; i < vetorC.length;i++){
            vetorC[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorC[i]);
        }

        input.close();
    }
}