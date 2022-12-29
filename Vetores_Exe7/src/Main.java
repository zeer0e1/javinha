import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double media = 0;
        double soma = 0;
        System.out.print("Quantos elementos vai ter o vetor ? ");
        int numerosInputs = input.nextInt();
        double[] numeros = new double[numerosInputs];
        for (int i = 0; i < numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = input.nextDouble();
            soma += numeros[i];
            media = soma / numerosInputs;
        }

        System.out.println();

        System.out.printf("MEDIA DO VETOR  = %.3f%n",media);
        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] < media){
                System.out.printf("%.2f%n",numeros[i]);
            }
        }
        input.close();
    }
}