package Chapter3.Target_Heart_Rate_Calculator;

import java.time.LocalDate;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRates ( String firstName, String lastName,int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day= day;
        this.month = month;
        this.year = year;
    }

    public String getFirstName ( ) {return firstName;}
    public void setFirstName ( String firstName ) {this.firstName = firstName;}

    public String getLastName ( ) {return lastName;}
    public void setLastName ( String lastName ) {this.lastName = lastName;}
    public int getDay ( ) {return day;}
    public void setDay ( int day ) {
        if ( day <= 31 ){
            this.day = day;
        }
    }

    public int getMonth ( ) {return month;}
    public void setMonth ( int month ) {
        if(month <= 12){
            this.month = month;
        }
    }

    public int getYear ( ) {return year;}
    public void setYear ( int year )  {
        if(year != 0 ){
            this.year = year;
        }
    }

    public String getBirthdate ( ) {  // to display date of birth
        return (year + "-"+ month + "-" +day);
    }

    public int getAge( ){  // to calculate age
         return (LocalDate.now().getYear())  - getYear () ;
    }

    public  int getMaximumHeartRate(){  // to calculate Maximum heart rate
       return   220 - getAge ()  ;
    }

   public int getTargetHeartRate(){   // to calculate target heart rate
        return ((220 - getAge ()) * 50) / 100;
    }
}
