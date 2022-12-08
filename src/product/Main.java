package product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter:");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();

        Product[] products=addProduct(number);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getId());
            System.out.println(products[i].getName());
            System.out.println(products[i].getCategory());
            System.out.println(products[i].getPrice());
        }
        System.out.println("findName");
        String name=scanner.next();
        findName(name,products);
        System.out.println("SumPrime:"+sumPrime(products));


    }

    public static Product[] addProduct(int number) {
        Scanner scanner = new Scanner(System.in);
        Product[] product = new Product[number];
        for (int i = 0; i < product.length; i++) {
            System.out.println("Name");
            String name = scanner.next();
            System.out.println("Price:");
            double price = scanner.nextDouble();
            System.out.println("Category:");
            String category = scanner.next();
            product[i] = new Product(i + 1, name, price, category);
        }
        return product;
    }
    public static void findName(String name,Product[]products){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getName().equals(name)){
                System.out.println("Find:"+name);
            }else {
                System.out.println("No Find "+ name);
            }
        }

    }
    public static double sumPrime(Product[]products){
        double sum=0;
        for (int i = 0; i < products.length; i++) {
            sum+=products[i].getPrice();
        }
        return sum;
    }
}
