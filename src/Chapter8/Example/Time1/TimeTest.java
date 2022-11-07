package Chapter8.Example.Time1;

public class TimeTest{
    public static void main(String[] args){
        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.print("");

        try{
            time.setTime1(99, 99, 99);
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String header,Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",header,
                t.toString(), t.toUniversalString());
    }
}
