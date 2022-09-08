package Chapter3.PetrolPurchase;

public class PetrolPurchase {

    private String location;
    private  String petrolType;
    private int quantityPurchased;
    private double price;
    private double discount;

    public PetrolPurchase ( double discount, String location, String petrolType,
                            int quantityPurchased, double price) {
        this.discount = discount;
        this.location = location;
        this.petrolType = petrolType;
        this.quantityPurchased = quantityPurchased;
        this.price = price;
    }


    public double getDiscount ( ) {
        return discount;
    }
    public void setDiscount ( double discount ) {
        this.discount = discount;
    }


    public String getPetrolType ( ) {
        return petrolType;
    }
    public void setPetrolType ( String petrolType ) {
        this.petrolType = petrolType;
    }


    public String getLocation ( ) {
        return location;
    }
    public void setLocation ( String location ) {
        this.location = location;
    }

    public double getPrice ( ) {return price;}
    public void setPrice ( double price ) {
        this.price = price;
    }

    public int getQuantityPurchased ( ) {return quantityPurchased;}
    public void setQuantity ( int quantity ) {this.quantityPurchased = quantity;}


    public double getAmountPurchased ( ) {
        return (quantityPurchased * price) - discount;
    }

}

