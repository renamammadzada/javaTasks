package Examples;

public class Mar7_example {
    public static void main(String[]args){

        System.out.println(checkYear(2017)? "Leap year" : "Is not a leap year");}

        public static boolean checkYear(int year){
        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;

        if(year %4 == 0)
            return true;
        return false;

    }
}
