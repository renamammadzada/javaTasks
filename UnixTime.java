package Examples;

public class UnixTime {
    public static void main(String[] args){
        long millis = 1613692839949L;

        long days = millis / 86400000;
        long remainingDays = millis % 86400000;


        long hours = remainingDays / 3600000;
        long remainingHours = remainingDays % 3600000;

        long min = remainingHours / 60000;
        long remainingMin = remainingHours % 60000;

        long seconds = remainingMin / 1000;
        long remainingSeconds = remainingMin % 1000;

        System.out.println ("Days: " + days+ "\n " + "Hours: " + hours+ "\n" + "Min: " + min + "\n" + "Seconds: " + seconds );




    }
}
