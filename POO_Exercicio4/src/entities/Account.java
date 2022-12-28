package entities;

public class Account {
   private  final int numberAccout;
   private String name;

   private double balance;


   public Account(int numberAccout,String name){
         this.numberAccout = numberAccout;
         this.name = name;
   }

   public Account(int numberAccout,String name,double balance){
       this.numberAccout = numberAccout;
       this.name = name;
       this.balance = balance;
   }

   public int getNumberAccout(){
       return  this.numberAccout;
   }

   public String getName(){
       return  this.name;
   }

   public void setName(String name){
       this.name = name;
   }

   public double getBalance(){
       return  this.balance;
   }

   public void deposit(double quantity){
       this.balance += quantity;
   }

   public void withdraw(double value){
       this.balance -= value + 5;
   }

   public String toString(){
       return  "Account "
               + getNumberAccout()
               +", Holder: "
               + getName()
               +", Balance: $ "
               +String.format("%.2f",getBalance());
   }




}
