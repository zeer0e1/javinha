import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.next();

        while (password.equals("2002")){
            System.out.println("Senha inválida");
            password = sc.next();
        }
        System.out.println("Acesso permitido");



        sc.close();
    }
}