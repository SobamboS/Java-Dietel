package Chapter3.Target_Heart_Rate_Calculator;

public class HeartRates {
  private String firstName;
  private String lastName;
  private int dateOfBirth;

    public HeartRates ( String firstName, String lastName, int dateOfBirth ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName ( ) {
        return firstName;
    }
    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName ( ) {
        return lastName;
    }
    public void setLastName ( String lastName ) {
        this.lastName = lastName;
    }

    public int getDateOfBirth ( ) {
        return dateOfBirth;
    }
    public void setDateOfBirth ( int dateOfBirth ) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge( double currentYear){
        return dateOfBirth = - dateOfBirth ;
    }
}
