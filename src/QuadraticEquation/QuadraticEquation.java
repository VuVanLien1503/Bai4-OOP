package QuadraticEquation;

public class QuadraticEquation {
    private double numberA;
    private double numberB;
    private double numberC;

    public QuadraticEquation() {

    }

    public QuadraticEquation
            (
            double numberA,
            double numberB,
            double numberC){
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }
    public double getNumberA(){
        return this.numberA;
    }
    public  double getNumberB(){
        return this.numberB;
    }
    public double getNumberC(){
        return  this.numberC;
    }
    public double getDiscriminant(){
        double delta=(this.numberB*2)-4*(this.numberA*this.numberC);
        return delta;
    }
    public double getRoot(){
        double r0=-(this.numberB/2*this.numberA);
        return r0;
    }
    public double getRoot1(){
        double r1=-(this.numberB)+Math.sqrt(this.numberB*2-4*(this.numberA*this.numberC)/2*this.numberA);
        return r1;
    }
    public double getRoot2(){
        double r2 = -this.numberB-Math.sqrt((this.numberB*2)-4*(this.numberA*this.numberC)/2*this.numberA);
        return r2;
    }
    public void getDisPlay(){
        if (getDiscriminant()>0){
            System.out.println("x1:"+getRoot1());
            System.out.println("x2:"+getRoot2());
        }else if (getDiscriminant()==0){
            System.out.println("x1=x2:= "+getRoot());
        }else {
            System.out.println("The equation has no roots");
        }
    }

}
