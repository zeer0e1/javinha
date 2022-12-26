package entities;

public class Product {
    public String name;
    public double price;
    public int quntity;


    public double totalValueInStock(){
        return price * quntity;
    }

    public void addProducts(int quntity){
        this.quntity += quntity;
    }

    public void removeProdutcts(int quntity){
        this.quntity -= quntity;
    }

    public String toString(){
        return name
              + ", $ "
              + String.format("%.2f",price)
              + ", "
              + quntity
              + " units, Total: $ "
              + String.format("%.2f",totalValueInStock());

    }
}
