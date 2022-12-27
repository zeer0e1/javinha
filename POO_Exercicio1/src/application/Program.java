package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle r = new Retangle();
        System.out.println("Enter retangle width and height");
        r.hight = sc.nextDouble();
        r.width = sc.nextDouble();


        System.out.println(r);


        sc.close();
    }
}
