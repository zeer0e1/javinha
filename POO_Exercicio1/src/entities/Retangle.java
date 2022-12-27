package entities;

public class Retangle {
    public double width;
    public double hight;

    public double Area (){
        return  width * hight;
    }

    public double Perimeter(){
        return 2 * ( width + hight);
    }

    public double diagonal (){
        return  Math.sqrt(((width * 2) + (hight * 2)));
    }

    public String toString(){
        return "Area = "
                + String.format("%.2f%n",Area())
                +"Perimiter = "
                + String.format("%.2f%n",Perimeter())
                + "Diagonal = "
                + String.format("%.2f",diagonal());

    }






}
