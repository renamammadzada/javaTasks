package Examples;

public class getRandomSSN {
    public static void main(String[] args){
        System.out.println(getRandomSSN());}

    public static String getRandomSSN(){
        int num1 = (-1 + (int)(Math.random() * 10));
        int num2 = (-1 + (int)(Math.random() * 10));
        int num3 = (-1 + (int)(Math.random() * 10));
        int num4 = (-1 + (int)(Math.random() * 10));
        int num5 = (-1 + (int)(Math.random() * 10));
        int num6 = (-1 + (int)(Math.random() * 10));
        int num7 = (-1 + (int)(Math.random() * 10));
        int num8 = (-1 + (int)(Math.random() * 10));
        int num9 = (-1 + (int)(Math.random() * 10));

        return "" + num1 + num2 + num3 + "-" + num4 + num5 +"-" + num6 + num7 + num8 +num9;

    }
}
