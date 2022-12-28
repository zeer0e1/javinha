package entities;

public class Pessoa {

    private String name;
    private  int age;
    private double height;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public double getHeight(){
        return  this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public Pessoa(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

}
