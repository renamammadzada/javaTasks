package Examples;

import java.util.Scanner;

public class practice {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
System.out.println("x: ");
        int x = scan.nextInt();
        System.out.println("y: ");
        int y = scan.nextInt();
        System.out.println("z: ");
        int z = scan.nextInt();
        System.out.println("Sum: " + (x + y + z));

       int i;
       int j;
       int k;

        i = j = k = 2;
        System.out.println( i + " " + j + " " + k);

        int number = 5;
        System.out.println(++number);
        System.out.println(number++);



    }
}
