package Examples;

public class Feb22 {
    public static void main(String[] args){

int random = (int) (Math.random() * 9000) + 1000;
System.out.println("The generated random number is: " + random);

int four = random % 10;
int oneTwoThree = random /10;

int three = oneTwoThree % 10;
int oneTwo = oneTwoThree / 10;

int two = oneTwo % 10;
int one = oneTwo / 10;


System.out.print(four);
        System.out.print(three);
        System.out.print(two);
        System.out.print(one);



        }
    }
