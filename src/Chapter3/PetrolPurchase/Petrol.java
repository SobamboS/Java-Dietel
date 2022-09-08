package Chapter3.PetrolPurchase;

public class Petrol {


    public static void main ( String[] args ) {

        PetrolPurchase P = new PetrolPurchase ( 5, "Yaba", "Lead",
                5, 280);

        System.out.printf("He bought the petrol at %s%n", P.getLocation ());
        System.out.printf("The type of petrol he bought is %s%n", P.getPetrolType());
        System.out.printf("He bought %d liter  of petrol %n", P.getQuantityPurchased () );
        System.out.printf("at the price of %.0f$ per liter %n", P.getPrice () );
        System.out.printf("with a discount of %.0f$ %n", P.getDiscount ());
        System.out.printf("Total amount of petrol purchased is %.0f$%n", P.getAmountPurchased () );

    }
}