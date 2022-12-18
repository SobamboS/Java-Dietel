package Chapter6;

public class ParkingCharges{

    public static void main(String[] args){



        System.out.println(calculateCharges());
    }

    public static int usedHours(int hour){
        return hour;
    }

    public static int amountCharged(int charges){
        return 2;
    }

    public static int calculateCharges(){

        return usedHours(24);
    }



}