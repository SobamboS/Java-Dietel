package Chapter3.ComputerizationOfHealthReacod;
import java.time.LocalDate;
public class HealthProfile {
    private String firstName;
    private String lastName;

    private String gender;
    double height;
    double weight;
    int year;
    int day;
    int month;



    public HealthProfile ( String firstName, String lastName, double height,
                           double weight, int year, int day, int month, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.year = year;
        this.day = day;
        this.month = month;
        this.gender = gender;
    }

    public int getYear ( ) {return year;}
    public void setYear ( int year ) {
        if ( year != 0 ) {
            this.year = year;
        }
    }

    public int getDay ( ) {return day;}
    public void setDay ( int day ) {
        if ( day <= 31 ){
        this.day = day;
        }
    }

    public int getMonth ( ) {return month;}
    public void setMonth ( int month ) {
        if ( month <= 12 ){
            this.month = month;
        }
    }

    public String getFirstName ( ) {return firstName;}
    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }
    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public double getHeight ( ) {
        return height;
    }
    public void setHeight ( double height ) {
        this.height = height;
    }

    public String getGender ( ) {return gender;}
    public void setGender ( String gender ) {this.gender = gender;}

    public double getWeight ( ) {return weight;}
    public void setWeight ( double weight ) {this.weight = weight;}

    public String getBirthDate(){return year + ":" + day + ":" + month;}

    public int getAge(){
      return   (LocalDate.now().getYear())  - getYear ();
    }
    public  int getMaximumHeartRate(){  // to calculate Maximum heart rate
        return   220 - getAge ()  ;
    }

    public int getTargetHeartRate(){   // to calculate target heart rate
        return ((220 - getAge ()) * 50) / 100;
    }

    public double getBodyMassIndex(){
        return  ((weight * 730) / height * height);
    }

}
