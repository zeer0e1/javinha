package application;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();

        student1.name = sc.nextLine();
        student1.nota1 = sc.nextDouble();
        student1.nota2 = sc.nextDouble();
        student1.nota3 = sc.nextDouble();

        student1.aproved();



        sc.close();
    }
}
