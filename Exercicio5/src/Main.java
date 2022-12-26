import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 5");

        Scanner sc = new Scanner(System.in);

        int typeCombustivel = 0;

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (typeCombustivel != 4){
            typeCombustivel = sc.nextInt();
            switch (typeCombustivel){
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                case 4:
                    System.out.print("");
                    break;
                default:
                    System.out.println("Código inválido");
            }
        }

        System.out.println("Muito obrigado");
        System.out.printf("Alcool: %d %n",alcool);
        System.out.printf("Gasolina: %d %n",gasolina);
        System.out.printf("Disel: %d %n",diesel);

        sc.close();
    }
}