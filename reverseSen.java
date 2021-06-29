package Examples;
public class reverseSen {
    public static void main(String[] args) {
        //Run Unit Tests to check your method correctness
        System.out.println(reverseEachWord("Hi how are you"));
        System.out.println(reverseEachWord("There are two ways to write error-free programs; only the third one works"));
    }


    public static String reverseEachWord(String str){

        String[] words = str.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--)
            {
                reverseWord = reverseWord + word.charAt(j);
            }

            reverseString = reverseString + reverseWord + " ";
            reverseString.trim();

        }
        return reverseString;
    }

}

