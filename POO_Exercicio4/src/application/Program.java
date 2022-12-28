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
        System.out.print("Enter the account holder: ");
        String _nameAccount = sc.next();
        sc.nextLine();
        System.out.print("Is there the initial deposit? (y/n) ");
        Character _initialDeposit = sc.nextLine().charAt(0);

        Account account;

        if (_initialDeposit.equals('y')){
            System.out.print("Enter the initial deposit value: ");
            double _initialDepositValue = sc.nextDouble();
            account = new Account(_accountNumber,_nameAccount,_initialDepositValue);
            System.out.println(account);
        }else {
            account = new Account(_accountNumber,_nameAccount);
            System.out.println("Account Data: ");
            System.out.println(account);
        }

        System.out.print("Enter a deposit value: ");
        double valueDeposit = sc.nextDouble();
        account.deposit(valueDeposit);
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println(account);

        sc.close();
    }
}
