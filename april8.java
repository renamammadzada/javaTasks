package Examples;

public class april8 {
    public static void main(String[] args) {
        System.out.println(reverseWordOrder("Hello World"));

    }


    public static String reverseWordOrder(String str){
        String words[] = str.split(" ");
        String reversedString = "";

        for (int i = 0; i < words.length; i++){
            if ( i == words.length - 1)
                reversedString = words[i] + reversedString;
            else
                reversedString = " " + words[i] + reversedString;
        }
        return reversedString.trim() ;
    }
}

