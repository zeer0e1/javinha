import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    /*
        System.out.println("PRIMEIRO EXERCICIO");
        int n1,n2;

         n1 = sc.nextInt();
         n2 = sc.nextInt();

         int soma = n1 + n2;

         System.out.println("SOMA = " + soma);



        System.out.println("SEGUNDO EXERCICIO");
        double area = 3.14159;
        double raio;

        raio = sc.nextDouble();

        System.out.printf("A =  %.4f",area * (Math.pow(raio,2)));

     */

        System.out.println("QUARTO EXERCICIO");

        int a,b,c,d;

       a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = (a * b - c*d);
        System.out.println("DIFERENCA = " + diferenca );
        sc.close();
    }
}