package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        double media = 0.0;
        double menorDeIdade = 0;

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantas pessoas serão cadastradas ? ");
        int n = input.nextInt();

        Pessoa[] vect = new Pessoa[n];

        for (int i = 0; i < vect.length;i++){
            System.out.printf("Dadps da %da pessoa: %n",i +1);
            System.out.print("Nome: ");
            input.nextLine();
            String nomeInput = input.nextLine();
            System.out.print("Idade: ");
            int idadeInput = input.nextInt();
            System.out.print("Altura: ");
            double alturaInput = input.nextDouble();
            vect[i] = new Pessoa(nomeInput,idadeInput,alturaInput);
        }

        for (int i = 0;i<vect.length;i++){
           media += vect[i].getHeight();
            if (vect[i].getAge() < 16){
                menorDeIdade += 1;
            }
        }
        
        System.out.println();
        System.out.printf("Altura média: %.2f%n",media / n);
        System.out.printf("Pessoas com menos de 16 anos : %.2f %n", menorDeIdade / n * 100);

        for (int i =0;i < vect.length;i++){
            if (vect[i].getAge() < 16){
                System.out.println(vect[i].getName());
            }
        }




        input.close();
    }
}
