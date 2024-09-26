import java.util.Scanner;
public class ShippingCalcLabFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter price of your item");
        int cost=0;

        if(in.hasNextInt()) {
            cost = in.nextInt();
            in.nextLine();
        }

        if (cost>=1.00 && cost<=50.00){
            System.out.println("Your shipping cost is $5.");
        }
        else if (cost>=51.00 && cost<=99.00){
            System.out.println("Your shipping is $10.");
    }
        else if (cost>=100.00){
            System.out.println("Your shipping is free.");
        }
        else{
            System.out.println("Input cost please.");
        }
    }
}