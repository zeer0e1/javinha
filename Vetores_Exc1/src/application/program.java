package application;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar ?");
        int n = input.nextInt();

        int[] vect = new int [n];

        for (int i = 0; i < vect.length;i++){
            System.out.print("Digite um numero: ");
            int numero = input.nextInt();
            vect[i] = numero;
        }

        System.out.println("Numeros negativos:");
        for(int i = 0; i <vect.length;i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }



        input.close();
    }
}