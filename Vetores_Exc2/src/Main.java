import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double soma = 0.0;
        double media = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int n = input.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length;i++){
            System.out.print("Digite um numero: ");
            vect[i] = input.nextDouble();
            soma += vect[i];
        }

        System.out.print("VALORES = ");

        for (double v : vect) {
            System.out.print(v + "  ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f%n",soma);

        media = soma / n;

        System.out.printf("MEDIA = %.2f%n",media);




        input.close();
    }
}