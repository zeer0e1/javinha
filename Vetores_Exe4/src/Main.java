import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int soma = 0;

        System.out.print("Quantos numeros você vai digitar? ");
        int numeroInputs = input.nextInt();

        int [] numeros = new int[numeroInputs];

        for(int i = 0; i < numeros.length;i++){
            System.out.print("Digite um número: ");
            numeros[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for(int i = 0; i < numeros.length;i++){
            if(numeros[i] % 2 == 0){
                System.out.print(numeros[i] + " ");
                soma+= 1;
            }
        }
        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d",soma);
        input.close();
    }
}