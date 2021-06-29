package Examples;

public class mar2 {
    public static void main(String[] args) {

        System.out.println(randomPassword());

    }
    public static  String randomPassword(){
        int password1 = (97 + (int)(Math.random()*26));
        int password2 = (97 + (int)(Math.random()*26));
        int password3 = (97 + (int)(Math.random()*26));
        int password4 = (97 + (int)(Math.random()*26));
        int password5 = (97 + (int)(Math.random()*26));

        /*
         password1 = (char)password1;
         password2 = (char)password2;
         password3 = (char)password3;
         password4 = (char)password4;
         password5 = (char)password5;
        */
        return "" + (char)password1 + (char)password2 + (char)password3 + (char)password4 + (char)password5;



}
}
