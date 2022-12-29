import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int numerosInputs = input.nextInt();
        double[] numeros = new double[numerosInputs];

        for(int i = 0; i < numeros.length;i++){
            System.out.print("Digite um numero: ");
            numeros[i] = input.nextDouble();
        }

        double  maior = Integer.MIN_VALUE;
        int  indiceMaior = -1;

        for (int i = 0; i < numeros.length;i++){
            if (numeros[i] > maior){
                maior = numeros[i];
                indiceMaior = i;
            }
        }

        System.out.println();
        System.out.printf("Maior valor = %.2f%n",maior);
        System.out.println("POSICAO DO MAIOR VALOR = "+ indiceMaior);
        input.close();
    }
}