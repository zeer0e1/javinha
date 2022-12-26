import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio 7");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }

        System.out.printf("%d in %n ",in);
        System.out.printf("%d out %n ",out);

        sc.close();
    }
}