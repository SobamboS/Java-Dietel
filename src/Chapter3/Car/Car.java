package Chapter3.Car;

public class Car {
    private String model;
    private String year;
    private double price;



public Car ( String model, String year, double price) {
    this.model = model;
    this.year = year;

    if (price > 0.0)
        this.price = price;

    }


    public void setModel ( String model ) {
        this.model = model;
    }

    public double getPrice ( ) {
        return price;
    }

    public void setPrice ( double price) {
        if (price > 0.0){
            this.price = price;
        }
    }

    public String getYear ( ) {
        return year;
    }
    public void setYear ( String year ) {
        this.year = year;
    }

    public String getModel () {
        return model;
    }
    public double getFinalPrice (double discount){
        return price - (price * discount) / 100;
    }
}
