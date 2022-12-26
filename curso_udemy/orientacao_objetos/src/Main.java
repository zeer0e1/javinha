import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Triangle x,y;
            x = new Triangle();
            y = new Triangle();


            System.out.println("Enter the measures of triangle X");
            x.a = sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();



            System.out.println("Enter the measures of triangle Y");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();

            double p = (x.a + x.b + x.c) / 2.0;

            double areaX = x.area();
            double areaY = y.area();

            System.out.printf("Triangule X area = %.4f%n",areaX);
            System.out.printf("Triangule Y area = %.4f%n",areaY);

            if (areaY > areaX){
                System.out.println("Larger area : X");
            }else{
                System.out.println("Larger area : Y");
            }
        }


    }
