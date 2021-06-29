package Examples;

import java.util.Scanner;


public class mar29 {
    public static void main(String[] args) {

        // Write all your code here

        int a, tryNum = 0;
        int b = (int) (Math.random()*(101));
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Please, enter your guess: ");
            tryNum++;
            a = sc.nextInt();
            if(a > 100 || a <0 ){
                System.out.println("You enetered an invalid number." + "\n" + "Please, enter a valid number.");}
            else {
                if (a>b){
                    System.out.println("Your guess is too high." + "\n" + "Please, enter your guess.");}
                if (a<b){
                    System.out.println("Your guess is too low." + "\n" + "Please, enter your guess.");}
            }
        } while(a != b);
        if(tryNum == 1){
            System.out.println("Congratulations, you found the number. It is" + b + "\n" + "You found it in 1 try.");}
        else{
            System.out.println("Congratulations, you found the number. It is " + b + "\n" + "You found it in " + tryNum + " tries");}


    }
}

