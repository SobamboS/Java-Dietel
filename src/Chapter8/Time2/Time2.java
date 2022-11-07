package Chapter8.Time2;

public class Time2{
    private int hour;
    private int minute;
    private int second;


    public Time2(){
        this(0,0,0);
    }

    public Time2(int hour){
        this(hour, 0, 0);
    }

    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }

//    public Time2(int hour ,int minute ,int second){
//        this(hour,minute,second);
//    }


    public Time2(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;

        if (hour < 0 || hour >= 24) {
        throw new IllegalArgumentException("hour must be 0-23");
        }

         if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
         }

         if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
         }
    }

    public Time2(Time2 time){
        this(time.hour,time.minute,time.second);
    }


    public void  setTime(int hour,int minute,int second){
        if (hour < 0 || hour >= 24) {
             throw new IllegalArgumentException("hour must be 0-23");
             }

         if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
         }

         if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
         }

         this.hour = hour;
         this.minute = minute;
         this.second = second;
         }

    public int getHour( ){
        return hour;
    }

    public void setHour(int hour){
        this.hour=hour;
    }

    public int getMinute( ){
        return minute;
    }

    public void setMinute(int minute){
        this.minute=minute;
    }

    public int getSecond( ){
        return second;
    }

    public void setSecond(int second){
        this.second=second;
    }

    public String toUniversalString() {
        return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
         }

    public String toString() {
         return String.format("%d:%02d:%02d %s",
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
         }
}


