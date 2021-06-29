package Examples;

public class April4 {
    public static void main(String[] args) {

        System.out.println(generatePlate("VA")); // -> e.g "ADS-2252"
        System.out.println(generatePlate("MD")); // -> e.g "3BS6121"
        System.out.println(generatePlate("DC")); // -> e.g "NS7821"
        System.out.println(generatePlate("NY")); // -> ""
    }
    // implement the method
    public static String generatePlate(String state) {
        String plate = "";
        if (state.equals("VA")) {
            plate = generateChar() + generateChar() + generateChar() + "-" + generateDigit() + generateDigit() + generateDigit() + generateDigit();
        } else if (state.equals("MD")) {
            plate = "" + generateDigit() + generateChar() + generateChar() + generateDigit() + generateDigit() + generateDigit() + generateDigit();
        } else if (state.equals("DC")) {
            plate = "" + generateChar() + generateChar() + generateDigit() + generateDigit() + generateDigit() + generateDigit();
        }
        return plate;
    }
    public static int generateDigit() {
        return (int) (Math.random() * 10);
    }
    public static String generateChar() {
        /* char[] alphabet = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'M', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        return String.valueOf(alphabet[(int) (Math.random() * alphabet.length)]);

         */
        String randomLetters = "";
       String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       int ranIndex = (int)(Math.random() * str.length());
       randomLetters = randomLetters + str.charAt(ranIndex);
        return randomLetters;
    }

}
