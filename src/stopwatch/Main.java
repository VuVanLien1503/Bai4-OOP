package stopwatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch =new StopWatch();
        stopWatch.star();
        System.out.println(stopWatch.getStartTime());
        Thread.sleep(1000);
        stopWatch.stop();
        System.out.println(stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}
