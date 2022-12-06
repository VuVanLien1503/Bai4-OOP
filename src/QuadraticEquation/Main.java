package QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter numberA:");
        double numberA=scanner.nextDouble();
        System.out.println("Enter numberB:");
        double numberB=scanner.nextDouble();
        System.out.println("Enter numberC:");
        double numberC=scanner.nextDouble();
        QuadraticEquation quadraticEquation=new QuadraticEquation(numberA,numberB,numberC);
        quadraticEquation.getDisPlay();
    }
}
