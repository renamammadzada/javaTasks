package Examples;
import java.util.Scanner;

public class Mar7 {
    public static void main(String[]args){
        BMIcalculator();}
        public static void BMIcalculator(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Please, enter your weight: ");
            double weight = scan.nextDouble();
            System.out.println("Please, enter your height: ");
            double height = scan.nextDouble();
        double BMI = weight / (height * height);

        if(BMI<18.5){
            System.out.printf("Your BMI: " + BMI + " Underweight.");}
        else if(BMI>=18.5 && BMI<25){
            System.out.println("Your BMI: " + BMI + " Normal.");}
        else if(BMI>=25 && BMI<30){
            System.out.println("Your BMI: " + BMI + " Overweight.");}
        else if(BMI>=30)
            System.out.println("Your BMI: " + BMI + " Obese.");
    }
        }


