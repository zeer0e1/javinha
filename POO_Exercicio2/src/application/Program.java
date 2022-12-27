package application;

import entities.Employer;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employer employer1 = new Employer();

        System.out.print("Name: ");
        employer1.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employer1.Salary = sc.nextDouble();
        System.out.print("Tax: ");
        employer1.Tax = sc.nextDouble();

        System.out.println(employer1);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

        employer1.increaseSalary(percentage);

        System.out.println("Update data: " + employer1);
        sc.close();
    }
}
