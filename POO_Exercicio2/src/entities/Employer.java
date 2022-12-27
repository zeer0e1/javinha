package entities;

import java.util.Locale;

public class Employer {

    public String name;
    public double Salary;
    public double Tax;

    public double NetSalary (){
        return Salary - Tax;
    }

    public void increaseSalary(double percentage){
        Salary += (percentage *  Salary) / 100 ;
    }

    public String toString(){
        return "Name: "
                + name
                + ",Salary, $ "
                + String.format("%.2f",NetSalary())
                + " Tax: "
                + Tax;
    }
}
