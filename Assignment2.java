package Examples;

import java.util.Scanner;

public class Assignment2 {
    public static <estimated, of, gas> void main (String []args){
        System.out.println ("This program will calculate the estimated cost of gas for your trip");
       Scanner scan = new Scanner(System.in);

        System.out.println ("Please, enter the distance that you are planning to travel: ");
          double distance = scan.nextDouble();
         System.out.println ("Please, enter the average MPG of the car that you are planning to drive: ");
          double MPG = scan.nextDouble();
         System.out.println ("Please, enter the current gas price: ");
         double gasPrice = scan.nextDouble();
         double totalGas = (distance/MPG);
        System.out.println ("Estimated amount of gas for your trip is: " + totalGas);
         double totalMoney = (gasPrice * totalGas);
        System.out.println ("Estimated cost of gas is: " + totalMoney);

 }

}
