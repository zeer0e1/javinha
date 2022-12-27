package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int  _accountNumber = sc.nextInt();
        System.out.print("Enter the account holder");
        String _nameAccount = sc.nextLine();
        System.out.println();
        System.out.print("Is there the initial deposit? (y/n) ");
        Character _initialDeposit = sc.nextLine().charAt(0);

        if (_initialDeposit.equals('y')){
            System.out.print("Enter the initial deposit value: ");
            double _initialDepositValue = sc.nextDouble();
            Account account = new Account(_accountNumber,_nameAccount,_initialDepositValue);
            System.out.println(account);
        }else {
            Account account = new Account(_accountNumber,_nameAccount);
            System.out.println("Account Data: ");
            System.out.println(account);
        }

        sc.close();
    }
}
