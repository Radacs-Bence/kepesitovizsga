package hu.nive.ujratervezes.kepesitovizsga.addigits;

public class AddDigits {

    public static final String DIGITS = "0123456789";


    public int addDigits(String input) {
        if (input == null || input.isBlank()) {
            return -1;
        }
        int result = 0;
        String[] characters = input.split("");
        for (String character : characters) {
            if (DIGITS.contains(character)){
                result += Integer.parseInt(character);
            }
        }
        return result;
    }
}
