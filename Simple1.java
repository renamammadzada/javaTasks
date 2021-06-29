package Examples;
import java.util.Scanner;

public class Simple1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter the amount in dollar: ");
        double Amount = scan.nextDouble();
        int amountPennie = (int)(Amount * 100);

        System.out.println("amountPennie: " + amountPennie);

        int dollar = amountPennie / 100;
        System.out.println("dollar: " + dollar);

int remainingDollar = amountPennie % 100;
System.out.println("remainingDollar: " + remainingDollar);

int quarters = remainingDollar / 25;
System.out.println("dime: " + quarters);

int remainingQuarters = remainingDollar % 25;
System.out.println("remainingDime: " + remainingQuarters);

int dime = remainingQuarters / 10;
System.out.println("dime: " + dime);

int remainingDime = remainingQuarters % 10;
System.out.println("remainingDime: " + remainingDime);

int nickels = remainingDime / 5;
System.out.println("nickels: " + nickels);

int remainingNickels = remainingDime % 5;
System.out.println("remainingNickels: " + remainingNickels);

int pennie = remainingNickels;
System.out.println("pennie: " + pennie);

System.out.print("Dollar: " + dollar +"\n" + "Quarters: " + quarters + "\n" + "Dime: " + dime +"\n" + "Nickels: " + nickels + "\n" +
        "Pennie: " + pennie);




        }
    }
