package Fan;

public class FanSpeed {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public FanSpeed() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FanSpeed(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        String result="";
        if (this.on){
            result ="Speed:"+this.speed+"\n"+"Color:"+this.color+"\n"+"Radius:"+this.radius+"\n"+"Fan Is ON";

        }else {
            result="Color:"+this.color+"\n"+"Radius:"+this.radius+"\n"+"Fan Is OFF";
        }
        return result;
    }
}
