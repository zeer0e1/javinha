import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double sum  = 0.0;
        double [] vect = new double [n];

        for (int i =  0; i < n; i++){
            vect[i] = input.nextDouble();
            sum += vect[i];
        }

        System.out.printf("ALTURA MEDIA: %.2f",sum / n);

        input.close();
    }
}