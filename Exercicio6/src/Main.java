import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 6");

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 0; i <= x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        sc.close();
    }
}