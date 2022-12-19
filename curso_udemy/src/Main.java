import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Tipo int
        int y = 32;

        //Tipo double
        double x = 10.35784;

        System.out.println("Sáida de dados em java");
        System.out.println(y);
        System.out.println(x);
        System.out.println("Formatando saida de dados");
        Locale.setDefault(Locale.US);
        System.out.println("Com duas casa decimais");
        System.out.printf("%.2f%n",x);
        System.out.println("Com 4 casa decimais");
        System.out.printf("%.4f%n",x);
        System.out.println();
        System.out.println();
        System.out.println("Concatenando variáveis");
        System.out.println("RESULTADO= " + x + " METROS");
        System.out.println();
        System.out.println();
        System.out.println("Utilizando o pritnf");
        System.out.printf("RESULTADO = %.2f metros%n",x);

        System.out.println("-----------------------");
        System.out.println("%f = ponto flutuante");
        System.out.println("%d = inteiro");
        System.out.println("%s = Texto");
        System.out.println("%n = quebra de linha");
        System.out.println("-----------------------");

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n",nome,idade,renda);
    }
}