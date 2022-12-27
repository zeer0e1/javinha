package entities;

public class Student {
    public String name;
   public double nota1,nota2,nota3;


    public void aproved(){
        double media = nota1 + nota2 + nota3;
        if (media >= 90.00){
            System.out.printf("FINAL GRADE = %.2f%nPASS",media);
        }else {
            System.out.printf("FINAL GRADE = %.2f%nFAILED %n",media);
            System.out.printf("MISSING %.2f POINTS",60.0 - media);

        }
    }



}
