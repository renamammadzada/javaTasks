package Examples;



public class DemoClass {
    public static void main(String[] args){
        int number = 5852;
        int four = number % 10;
        System.out.println(four);

        int oneTwoThree = number / 10;
        System.out.println("oneTwoThree: " + oneTwoThree);

        int three = oneTwoThree % 10;
        System.out.println("three: " + three);

        int oneTwo = oneTwoThree / 10;
        System.out.println("oneTwo: " + oneTwo);

int two = oneTwo % 10;
System.out.println("two: " + two);

int one = oneTwo / 10;
System.out.println("one: " + one);

int output = one * two * three * four - (one + two + three + four);
System.out.println("output: " + output);

    }
}
