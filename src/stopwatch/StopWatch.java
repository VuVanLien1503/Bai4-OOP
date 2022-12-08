package stopwatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;
   public StopWatch(){
    }
    public StopWatch(long startTime, long endTime){
       this.startTime=startTime;
       this.endTime=endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public void star(){
       this.startTime=System.currentTimeMillis();
    }
    public void stop(){
       this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
        long result = this.endTime-this.startTime;
        return result;
    }

}
