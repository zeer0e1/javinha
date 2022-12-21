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



        System.out.println("QUARTO EXERCICIO");

        int a,b,c,d;

       a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = (a * b - c*d);
        System.out.println("DIFERENCA = " + diferenca );




        System.out.println("Quinto exercício");

        int cod1, n1,cod2,n2;
        double vl1,vl2;

        cod1 = sc.nextInt();
        n1 = sc.nextInt();
        vl1 = sc.nextDouble();

        cod2 = sc.nextInt();
        n2 = sc.nextInt();
        vl2 = sc.nextDouble();

        double total = (vl1 * n1) + (vl2 * n2);



        System.out.printf("VALOR A PAGAR: RS$  %.2f",total);

     */

        System.out.println("Quarto exercício");

        int numero_funcionario;
        int numero_horas_trabalhadas;
        double valor_hora;

        numero_funcionario = sc.nextInt();
        numero_horas_trabalhadas = sc.nextInt();
        valor_hora = sc.nextDouble();

        System.out.printf("Number %d %n",numero_funcionario);
        System.out.printf("Salary %.2f ",valor_hora * numero_horas_trabalhadas);

        sc.close();
    }
}