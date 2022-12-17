package Chapter6;

public class ParkingCharges{
    static int hour;
    static int charges=2;
    public static void main(String[] args){
ParkingCharges charges1 = new ParkingCharges();

        System.out.println();
    }


    public void calculateCharges(){
        if(hour++ > 3){
            charges+=0.50;
        }else if(hour>=24) {
            charges=10;
        }


    }
}