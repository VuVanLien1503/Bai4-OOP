package stopwatch;

import java.util.Date;

public class StopWatch {
    private double startTime;
    private double endTime;
   public StopWatch(){
    }
    public StopWatch(double startTime,double endTime){
       this.startTime=startTime;
       this.endTime=endTime;
    }
    public Date getStartTime(){
       long millis=System.currentTimeMillis();
        java.util.Date date=new java.util.Date(millis);
        return date;
    }

}
