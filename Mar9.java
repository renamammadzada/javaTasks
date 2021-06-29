package Examples;
import java.util.Scanner;
public class Mar9 {
public static void main(String[]args){
    System.out.println(message());}

    public static String message(){
Scanner input = new Scanner (System.in);

    System.out.println("Enter a day: ");
    String day = input.nextLine();
    switch (day) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
            System.out.println("Working hard!");
            break;

        case "Friday":
            System.out.println("The weekend is almost here! TGIF!");
            break;

        case "Saturday":
        case "Sunday":
            System.out.println("It's party time! Alright!");
            break;

        default:
            System.out.println("You partied too hard this weekend, bro!");
            break;
    }
    return ("");
    }

}

