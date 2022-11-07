package Chapter3.Clock_Class;

public class Clock {
    int hour;
    int second;
    int minute;

    public Clock ( int hour, int second, int minute ) {
        if(hour > 23) hour = 0; this.hour = hour;

        if(second > 59 ) second = 0; this.second = second;

        if(minute > 59 ) minute = 0;  this.minute = minute;
    }

    public int getHour ( ) {
        return hour;
    }
    public void setHour ( int hour ) {
            this.hour = hour;
    }

    public int getSecond ( ) {
        return second;
    }
    public void setSecond ( int second ) {
         this.second = second;
    }

    public int getMinute ( ) {
        return minute;
    }
    public void setMinute ( int minute ) {
         this.minute = minute;
    }
    public String getDisplayTime(){
        return  ( hour + ":" + minute + ":" + second);
    }
    }
