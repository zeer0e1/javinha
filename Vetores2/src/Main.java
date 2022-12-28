import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        int n = input.nextInt();


        Product [] vect = new Product[n];

        for (int i = 0; i< vect.length;i++){
            input.nextLine();
            String name = input.nextLine();
            double price = input.nextDouble();
            vect[i] = new Product(name,price);

        }

        double sum = 0.0;

        for (Product product : vect) {
            sum += product.getPrice();
        }

        double avg = sum / n;
        System.out.printf("Average price = %.2f%n",avg);


        input.close();
    }
}